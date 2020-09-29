package vip.epss.dao;

import vip.epss.domain.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectAll();
    public Integer deleteByUid(Integer uid);
}
