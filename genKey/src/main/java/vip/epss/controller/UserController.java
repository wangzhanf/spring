package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.User;
import vip.epss.service.UserService;

//User的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserController {

    @Autowired
    private UserService userService;


//插入一个新用户
    @Test
    public void testUserInsert(){
        User user = new User();
        user.setUsername("zs1");
        user.setPassword("123456");
        userService.insert(user);
    }

    //删除一个用户的同时删除对应的userinfo信息
    @Test
    public void testUserWithUserinfoDelete(){
        Integer deleteNum = userService.delete(8);
        System.out.println("成功删除了"+deleteNum+"条用户记录");
    }

}
