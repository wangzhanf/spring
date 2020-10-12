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
//    @Autowired
//    private UserinfoMapper userinfoMapper;

    @Override
    public User selectOne(Integer uid) {
        return userMapper.selectByUid(uid);
    }

    @Override
    public User selectByUidOne(Integer uid) {
        return userMapper.selectByUidOne(uid);
    }

//    @Override
//    public Integer insert(User user) {
//        //先插入用户,然后才能插入用户信息,用户信息中的fuid关联到user表的uid
//
////        userinfoMapper.insert(userinfo);
//
//        return userMapper.insert(user);
//    }
}
