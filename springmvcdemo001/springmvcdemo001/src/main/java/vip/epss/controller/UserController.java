package vip.epss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vip.epss.domain.User;

@RequestMapping(value = "/user")
@Controller
public class UserController {

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
