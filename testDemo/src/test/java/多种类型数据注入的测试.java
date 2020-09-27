import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.pojo.Employee;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/28 0028
 * @描述
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:EmployeeBeans.xml"})
public class 多种类型数据注入的测试 {

    @Autowired
    private Employee employee;

    @Test
    public void test01(){
        System.out.println(employee);
        System.out.println(employee.getEtest() == null);
    }
}
