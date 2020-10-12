package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.dao.UserMapper;
import vip.epss.domain.User;
import vip.epss.service.UserService;

import java.util.List;

//@Component
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserController {
    @Autowired
    private UserService userService;


    @Test
    public void test01() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<User> users = userService.findAll();
        System.out.println(users);

    }

//    测试插入新用户
    @Test
    public void testInsert(){
        User newUser = new User("zs11111111111111111", "123213213213213");
        userService.insert(newUser);
    }

}
