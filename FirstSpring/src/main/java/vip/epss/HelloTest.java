package vip.epss;

//测试通过配置类创建IOC容器并从IOC容器获取Bean

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        //为了获取IOC容器内容,首先应该创建context上下文对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        //通过context对象提供的getBean方法获取Bean,默认情况获得的对象是Object的,需要强制类型转换
//        Hello newhello = (Hello) context.getBean("newhello");
        Hello newhello = context.getBean("newhello", Hello.class);
        newhello.setMesssage("我的新消息");
        System.out.println(newhello);
    }
}
