package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vip.epss.dao.UserDao;
import vip.epss.domain.User;
import vip.epss.service.UserService;

import java.util.List;

//UserService的实现类
//@Component  注解的目的是让被修饰的类成为spring容器中的bean
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("userService de findall method");
        return userDao.selectAll();
    }
}
