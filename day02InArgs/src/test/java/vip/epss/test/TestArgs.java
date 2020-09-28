package vip.epss.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class TestArgs {

    @Autowired
    private Emp emp;

    @Test
    public void test01(){
        System.out.println(emp);
        System.out.println(emp.getEobj() == null);
    }
}
