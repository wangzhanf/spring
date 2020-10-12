package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Account;
import vip.epss.domain.User;
import vip.epss.service.AccountService;
import vip.epss.service.UserService;

import java.util.List;

//User的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserController {

    @Autowired
    private UserService userService;

    @Test
    public void testUserSelectOne(){
        User user = userService.selectOne(1);
        System.out.println(user);
    }



    @Test
    public void testUserSelectByUidOne(){
        User user = userService.selectByUidOne(1);
        System.out.println(user);
    }
}
