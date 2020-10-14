package vip.epss.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {


//    @ResponseBody
//    设置虚拟路径的映射,当前的路径和对应的handler放在映射处理器中
    @RequestMapping(value = "/index")
    public String sayHello(){
        return "abc";
    }
//    springMVC中controller返回字符串,默认返回的是视图的名称
//    如果方法的返回值是void类型,当前的url虚拟路径作为视图的名称

    @RequestMapping(value = "/user")
    public String toUser(){
        return "user";
    }
}
