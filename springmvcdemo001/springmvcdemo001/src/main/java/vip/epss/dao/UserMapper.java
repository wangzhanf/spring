package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;
import vip.epss.domain.User;

import java.util.List;

public interface UserMapper {
    public abstract User selectUser(User user);
}