import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
public class Demo0002_配置类实现方式 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Person newPerson = annotationConfigApplicationContext.getBean("newPerson", Person.class);
        System.out.println(newPerson);
    }
}
