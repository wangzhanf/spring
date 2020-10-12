package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.User;
import vip.epss.domain.Userinfo;
import vip.epss.service.UserService;
import vip.epss.service.UserinfoService;

//User的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    //测试懒加载
    @Test
    public void testSelectWithLazyLoad(){
        Userinfo userinfo = userinfoService.selectByUiid(3);
        System.out.println(userinfo.getPhone());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(userinfo.getUser().getUsername());
    }


}
