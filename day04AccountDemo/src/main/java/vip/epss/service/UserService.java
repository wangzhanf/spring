package vip.epss.service;

import vip.epss.domain.User;

public interface UserService {
    //根据用户id查找该用户的所有信息[包括其对应的账号信息]
    public User selectOne(Integer uid);
//    public Integer insert(User user);
}
