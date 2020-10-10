package vip.epss.service;

import vip.epss.domain.Account;

import java.util.List;

public interface AccountService {
    //这是账号之间转账的业务处理,src转出账号,dist转入账号
    public Boolean transfer(Account src,Account dist);
    public Account selectByAid(Integer aid);
    public List<Account> selectAll();
}
