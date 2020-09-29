package vip.epss.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Boss;
import vip.epss.domain.Car;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class SpringTest {

    @Autowired
    private Boss boss;

    @Test
    public void test01(){
        boss.getCar().setWheel(4);
        System.out.println(boss);
    }

    @Test
    public void test02(){
        //拿到容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取bean
        Car car1 = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);
        car1.setWheel(3);
        System.out.println(car1);
        System.out.println(car2);
    }
}
