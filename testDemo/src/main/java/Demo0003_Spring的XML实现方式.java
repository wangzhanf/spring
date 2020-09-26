import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/25 0025
 * @描述
 */
public class Demo0003_Spring的XML实现方式 {

    //从类名称可以看出是解析XML格式Bean的工厂类
    @Test
    public void XmlBeanFactory方式() {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Person person = (Person) xmlBeanFactory.getBean("person");//采用了强制类型转换的方式
        System.out.println(person);
    }

    //通过FileSystemXmlApplicationContext获取spring配置文件的方式,需要说明文件存储的位置,这种绝对路径的方式存在的缺陷
    @Test
    public void fileSystemXmlApplicationContext方式() {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("D:\\work\\东软课程\\东软 社招_2020_JAVA_6班\\spring\\testDemo\\src\\main\\resources\\Beans.xml");
        Person person = fileSystemXmlApplicationContext.getBean("person", Person.class);//采用了正常的
        System.out.println(person);
    }

    //通过ClassPathXmlApplicationContext获取spring配置文件的方式,如果是第一个例子,需要说明文件存储的位置和classpath的概念
    @Test
    public void classPathXmlApplicationContext方式() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:Beans.xml");
        Person person = classPathXmlApplicationContext.getBean("person", Person.class);//采用了正常的
        System.out.println(person);
    }


}
