package vip.epss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vip.epss.dao.UserDao;
import vip.epss.dao.UserDaoImpl;
import vip.epss.service.UserService;
import vip.epss.service.UserServiceImpl;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
@Configuration
public class UserConfig {
    @Bean(name="userDao")
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
    @Bean(name = "userService")
    public UserService getUserService(UserDao userDao){
        return new UserServiceImpl(userDao);
    }
}
