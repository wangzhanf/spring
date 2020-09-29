package vip.epss.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Boss;

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
}
