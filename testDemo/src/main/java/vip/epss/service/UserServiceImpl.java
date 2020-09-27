package vip.epss.service;

import vip.epss.dao.UserDao;
import vip.epss.pojo.User;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUser(String name, String password) {
        System.out.println("UserServiceImpl的findUser方法被调用了");
        userDao.findUser(name,password);
        return null;
    }
}
