package vip.epss.service;

import vip.epss.domain.User;

public interface UserService {
    //根据用户id查找该用户的所有信息[包括其对应的账号信息]
    public Integer insert(User user);
    //根据用户id删除用户,实现类中实现同时删除用户信息
    public Integer delete(Integer uid);
    //根据uid获取唯一一条User信息记录
    public User selectByUid(Integer uid);
}
