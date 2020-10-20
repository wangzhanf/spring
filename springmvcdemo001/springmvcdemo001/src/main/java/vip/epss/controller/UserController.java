package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.User;
import vip.epss.service.UserService;
import vip.epss.utils.MessageAndData;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody   //将返回的内容按照原始文档体的方式返回给调用者
    @RequestMapping(value = "/list")
    public MessageAndData list(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "zs", "1"));
        users.add(new User(2, "ls", "1"));
        users.add(new User(3, "ww", "1"));

        return MessageAndData.success().add("users",users);
    }

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



    @RequestMapping(value = "/up")
    public String up(String username,MultipartFile item) throws IOException {
//        System.out.println(username);
//        System.out.println(item);

        //原始名称
        String originalFilename = item.getOriginalFilename();
        if(item !=null && originalFilename !=null && originalFilename.length()>0) {
            //存储图片的物理路径
            String pic_path = "c:\\upload\\";
            //新的图片名称
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path + newFileName);

            //将内存的数据写入磁盘
            item.transferTo(newFile);

        }
//

        return "register";
    }
}
