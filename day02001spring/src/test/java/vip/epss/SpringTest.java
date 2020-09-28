package vip.epss;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import vip.epss.config.PersonConfig;
import vip.epss.domain.Person;

public class SpringTest {

    @Test
    public void test传统方法(){
        Person person = new Person();
        person.setName("wangzhanf");
        person.setAge(18);

        System.out.println(person);
    }

    @Test
    public void test配置类的方式(){
        //如何获取容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
        //获得Bean
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        //测试实例
        System.out.println(person);

    }
    @Test
    public void testBeanFactory(){
        //底层的容器,按需调用,嵌入式设备
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Person person = xmlBeanFactory.getBean("newperson", Person.class);
        System.out.println(person);
    }

    @Test
    public void testFsxac(){
        //配置文件的物理路径
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\wangzhanf\\spring\\day02spring\\src\\main\\resources\\Beans.xml");
        Person person = context.getBean("newperson", Person.class);
        System.out.println(person);
    }

    @Test
    public void testCpxac(){
        //最通用的用法,  spring启动的时候容器就会创建
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Person person = context.getBean("newperson", Person.class);
        System.out.println(person);
    }
}
