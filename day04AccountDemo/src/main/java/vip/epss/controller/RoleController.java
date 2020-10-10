package vip.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public void testRoleSelectAll(){
        //分页插件的初始化 pn 当前页码数,   每页的记录数
        PageHelper.startPage(1, 3);
//查询第3页
        List<Role> roles = roleService.selectAll();
        //将获取到的记录集合封装到pageInfo对象中
        PageInfo<Role>  pageInfo = new PageInfo<>(roles);
        //return pageInfo;
        System.out.println(pageInfo);
//        for (Role role:roles
//             ) {
//            System.out.println(role);
//        }
    }

    @Test
    public void testRoleDelete(){
        Integer integer = roleService.deleteByRid(1);
        if(integer>0){
            System.out.println("删除了"+integer+"条角色信息");
        }
    }
}
