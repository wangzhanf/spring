package vip.epss.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ResourceLoader;
import vip.epss.domian.Hello;

public class HelloTest {

    @Test
    public void testFsxac(){
        //获取applicationContext容器
        //缺陷分析:   配置文件采用了绝对路径,部署不方便
        //测试的手段过于单一    如何方便测试
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\wangzhanf\\spring\\secondSpring\\src\\Beans.xml");
        Hello secondHello = context.getBean("secondHello", Hello.class);
        System.out.println(secondHello);
    }

    @Test
    public void testxbf(){
        //通过XMLFactoryBean获取容器
        //通过classPath方式和获取文件,没有使用绝对路径,文件必须要放在classpath下,idea下maven的编译设置中
        //resources目录默认就在classpath中
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Hello secondHello = factory.getBean("secondHello", Hello.class);
        System.out.println(secondHello);
    }


    //使用最广泛的方法ClassPathXmlApplicationContext
    @Test
    public void testCpxac(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Hello secondHello = context.getBean("secondHello", Hello.class);
        System.out.println(secondHello);
    }
}
