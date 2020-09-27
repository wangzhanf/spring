package vip.epss;
//如果让一个普通的java类能够成为spring的配置类,需要使用基础的注解   @configuration
//查找开发环境中是否存在某个类或方法的方式    (ctrl+N    或者连续两次按   shift键)

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    //@Bean   在spring的IOC  容器中将被@Bean修饰的方法返回的对象实例  纳入到超级工厂容器中

    @Bean(name="newhello")
    public Hello getHello(){
        return new Hello();
    }

}
