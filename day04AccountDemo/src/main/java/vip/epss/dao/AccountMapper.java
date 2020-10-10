package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.Account;

import java.util.List;

@Repository(value = "accountMapper")
public interface AccountMapper {
    //更新账号信息
    public Integer update(Account account);
    //根据主键查找账号信息
    public Account selectByAid(Integer aid);
    //获取所有的账号信息,其中包括该账号对应的用户基本信息
    public List<Account> selectAll();
}
