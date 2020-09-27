package vip.epss.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import vip.epss.domian.Hello;

public class HelloTest {
    public static void main(String[] args) {
        //获取applicationContext容器
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\wangzhanf\\spring\\secondSpring\\src\\Beans.xml");
        Hello secondHello = context.getBean("secondHello", Hello.class);
        System.out.println(secondHello);
    }
}
