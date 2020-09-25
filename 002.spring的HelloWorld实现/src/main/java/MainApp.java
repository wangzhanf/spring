import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/24 0024
 * @描述
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloworld = (HelloWorld) classPathXmlApplicationContext.getBean("helloWorld");
        System.out.println(helloworld.getMessage());
    }
}
