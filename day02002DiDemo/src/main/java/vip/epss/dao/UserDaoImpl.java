package vip.epss.dao;

import vip.epss.pojo.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUser(String username, String password) {
        System.out.println("UserDaoImpl中的findUser()方法执行了");
        return new User("wzf","111");
    }
}
