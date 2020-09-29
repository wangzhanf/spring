package vip.epss.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import vip.epss.dao.UserDao;
import vip.epss.domain.User;

import java.util.LinkedList;
import java.util.List;

//UserDao的实现类
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAll() {
        User zs = new User("zs", "111");
        User ls = new User("ls", "222");
        List<User> users = new LinkedList();
        users.add(zs);
        users.add(ls);
        return users;
    }
}
