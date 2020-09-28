package vip.epss.dao;

import vip.epss.pojo.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User findUser(String username, String password) {
        return new User("wzf","111");
    }
}
