package vip.epss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vip.epss.config.UserConfig;
import vip.epss.service.UserService;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
public class UserTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        userService.findUser("wang","111111");

        System.out.println(annotationConfigApplicationContext.getBeanDefinitionCount());
        for (String name :
                annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
