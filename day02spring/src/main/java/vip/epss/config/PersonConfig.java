package vip.epss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vip.epss.domain.Person;

@Configuration
public class PersonConfig {
    @Bean(name = "person")
    public Person getPerson(){
        return new Person("wzf",19);
    }
}
