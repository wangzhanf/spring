package vip.epss.service;

import vip.epss.domain.User;

import java.util.List;

//UserService接口定义
public interface UserService {
    public List<User> findAll();
    public Integer insert(User user);
    public Integer delete(Integer uid);
    public Integer update(User user);
    public User selectByUid(Integer uid);
}
