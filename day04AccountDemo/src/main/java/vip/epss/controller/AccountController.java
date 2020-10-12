package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Account;
import vip.epss.service.AccountService;

import java.util.List;

//Account的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTranser(){
//        Account zs = new Account(1, "zs", 999.99);
//        Account ls = new Account(2, "ls", 9.99);

        Account src = accountService.selectByAid(1);
        src.setAname("新名字");
        System.out.println("src~~~~~~"+src);
        Account dist = accountService.selectByAid(2);

        if(accountService.transfer(src,dist)){
            System.out.println("转账成功");
        }else{
            System.out.println("转账失败");
        }
    }

    @Test
    public void testFindAllAccount(){
        List<Account> accounts = accountService.selectAll();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAidAccount(){
        Account account1 = accountService.selectByAid(1);
        System.out.println(account1.getAname());
    }
}
