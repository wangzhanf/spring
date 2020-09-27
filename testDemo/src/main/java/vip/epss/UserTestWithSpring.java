package vip.epss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.config.UserConfig;
import vip.epss.pojo.User;
import vip.epss.service.UserService;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:UserBeans.xml"})
//@ContextConfiguration(classes = UserConfig.class)
public class UserTestWithSpring {
    @Autowired
    private UserService userService;

    @Test
    public void testSpringWithJunit(){
        User user = userService.findUser("wang", "123456");
        System.out.println(user);
    }
}


