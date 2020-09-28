package vip.epss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.service.UserService;
import vip.epss.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)     //使用spring的容器作为平台运行junit
@ContextConfiguration(locations = {"classpath:UserBeans.xml"})   //通过配置文件获取context容器
public class TestSpring {
    @Autowired     //自动注入
    private UserService userService;


    @Test
    public void test01(){
        //先拿容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        Boolean aBoolean = userService.login("zs", "222");
        if(aBoolean){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }
    }

    @Test
    public void test02(){
        Boolean aBoolean = userService.login("zs", "222");
        if(aBoolean){
            System.out.println("登陆成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
