package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;
import vip.epss.domain.User;

import java.util.List;

public interface UserMapper {
    public abstract User selectUser(User user);
    @Select("select * from user where uid=#{uid}")
    public abstract User selectByPrimaryKey(Integer uid);
    public abstract List<User> select();
    public abstract Integer insert(User user);
    public abstract Integer delete(Integer uid);
    public abstract Integer update(User user);
}