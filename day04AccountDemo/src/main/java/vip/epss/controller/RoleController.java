package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Role;
import vip.epss.domain.User;
import vip.epss.service.RoleService;
import vip.epss.service.UserService;

import java.util.List;

//User的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Test
    public void testRoleSelectOne(){
        List<Role> roles = roleService.selectAll();
        for (Role role:roles
             ) {
            System.out.println(role);
        }
    }

    @Test
    public void testRoleDelete(){
        Integer integer = roleService.deleteByRid(1);
        if(integer>0){
            System.out.println("删除了"+integer+"条角色信息");
        }
    }
}
