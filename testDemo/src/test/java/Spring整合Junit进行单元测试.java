import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.pojo.User;
import vip.epss.service.UserService;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/27 0027
 * @描述
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration(locations = {"classpath:Beans.xml","classpath:UserBeans.xml"})
public class Spring整合Junit进行单元测试 {

    @Autowired
    private Person person;
    @Autowired
    private UserService userService;

    @Test
    public void testPerson(){
        System.out.println(person);
    }

    @Test
    public void testUser(){
        User user = userService.findUser("zs","123");
        System.out.println(user);
    }
}
