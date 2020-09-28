package vip.epss.dao;

import vip.epss.pojo.User;

public interface UserDao {
    //定义方法
   public User findUser(String username, String password);
}
