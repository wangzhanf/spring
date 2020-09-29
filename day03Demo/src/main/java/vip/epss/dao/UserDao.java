package vip.epss.dao;

import vip.epss.domain.User;

import java.util.List;

//User的Dao层接口
public interface UserDao {
    //提供了一个可以返回所有User对象的方法
    public List<User> selectAll();
}
