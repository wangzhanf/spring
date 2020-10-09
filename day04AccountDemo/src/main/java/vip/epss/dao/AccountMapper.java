package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.Account;

@Repository(value = "accountMapper")
public interface AccountMapper {
    //更新账号信息
    public Integer update(Account account);
    //根据主键查找账号信息
    public Account selectByAid(Integer aid);
}
