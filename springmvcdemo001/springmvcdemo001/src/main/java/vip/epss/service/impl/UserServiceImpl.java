package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.ShaccountMapper;
import vip.epss.dao.StockpoolMapper;
import vip.epss.dao.UserMapper;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;
import vip.epss.domain.StockpoolExample;
import vip.epss.domain.User;
import vip.epss.service.ShaccountService;
import vip.epss.service.UserService;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<User> select() {
        return userMapper.select();
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer delete(Integer uid) {
        return userMapper.delete(uid);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }
}
