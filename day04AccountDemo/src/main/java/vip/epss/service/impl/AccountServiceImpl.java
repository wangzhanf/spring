package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import vip.epss.dao.AccountMapper;
import vip.epss.domain.Account;
import vip.epss.service.AccountService;

//实现对应的servcie接口
//@Component   @Controller   @Service   @Repository
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Boolean transfer(Account src, Account dist) {
        src.setBalance(src.getBalance()-100);
        accountMapper.update(src);//转出账号减少100元
        //System.out.println(12/0);
        dist.setBalance(dist.getBalance()+100);
        accountMapper.update(dist);
        return true;
    }
}
