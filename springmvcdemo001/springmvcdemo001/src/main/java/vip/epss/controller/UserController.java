package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.epss.domain.User;
import vip.epss.service.UserService;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String toLogin(){
        return "login";
    }

    //登录检查
    @RequestMapping(value = "/loginCheck")
    public String loginCheck(@Validated @ModelAttribute(value = "user")User user, BindingResult bindingResult, HttpServletRequest request){
        //登录检查前进行数据校验
        if(bindingResult.hasErrors()){
            return "login";
        }
        //登录检查
        User byUser = userService.selectUser(user);
        if(byUser!=null){
            //登录成功后将用户的基本信息写入到session中
            request.getSession().setAttribute("USER_SESSION",byUser);
            return "abc";
        }else{
            return "login";
        }

    }

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();//使所有的session失效
        return "forward:/index.jsp";
    }

    @RequestMapping(value = "/reg")
    public String toRegister(){
        return "register";
    }

    @RequestMapping(value = "/doRegister")
    public void doRegister(User user){
        System.out.println(user);
        System.out.println("处理用户的注册申请");
    }
}
