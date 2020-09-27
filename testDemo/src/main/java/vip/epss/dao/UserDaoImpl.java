package vip.epss.dao;

import vip.epss.pojo.User;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
public class UserDaoImpl implements UserDao{
    @Override
    public User findUser(String name, String password) {
        System.out.println("UserDaoImpl的findUser方法被执行了");
        return null;
    }
}
