package vip.epss.service;

import vip.epss.dao.UserDao;
import vip.epss.dao.UserDaoImpl;
import vip.epss.pojo.User;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Boolean login(String username, String password) {
        System.out.println("UserServiceImpl 中的login()方法执行了   ");
        User user = userDao.findUser(username, password);
        if(user.getUsername()=="wzf"&&user.getPassword()=="111"){
            return true;
        }else{
            return false;
        }
    }
}
