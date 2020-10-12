package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.User;

@Repository(value = "userMapper")
public interface UserMapper {
    public Integer insert(User user);
    public Integer delete(Integer uid);
    public User selectByUid(Integer uid);
}
