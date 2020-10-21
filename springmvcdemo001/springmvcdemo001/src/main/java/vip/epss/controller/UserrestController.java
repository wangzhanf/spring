package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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

@RequestMapping(value = "/userrest")
//@Controller
//@ResponseBody
@RestController //@Controller+@ResponseBody
public class UserrestController {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    @GetMapping(value = "/opt")
//    @ResponseBody
    public MessageAndData toUserrest(){
        List<User> users = userService.select();
        return MessageAndData.success().add("users",users);
    }
    @DeleteMapping(value = "/opt/{uid}")
    public MessageAndData delete(@PathVariable("uid") Integer uid){
        userService.delete(uid);
        return MessageAndData.success();
    }
}
