package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.UserMapper;
import vip.epss.domain.User;
import vip.epss.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOne(Integer uid) {
        return userMapper.selectByUid(uid);
    }
}
