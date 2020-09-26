import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
//该注解标明这是一个配置类,指明在spring应用的上下文环境如何创建和装配Bean
@Configuration
public class AppConfig {
    //该注解告诉Spring将这个方法返回的对象注册为Bean
    @Bean(name="newPerson")
    public Person getPerson(){
        return new Person("wangzhanfConfig",20);
    }
}
