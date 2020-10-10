package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.User;

@Repository(value = "userMapper")
public interface UserMapper {
    //查询用户信息,根据uid查询,携带账号信息
    public User selectByUid(Integer uid);
    //插入一个新用户
//    public Integer insert(User user);
}
