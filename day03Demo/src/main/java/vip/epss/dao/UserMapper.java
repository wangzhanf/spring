package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.User;

import java.util.List;

//User的Dao层接口
//@Repository("userMapper")
public interface UserMapper {
    public User selectByUid(Integer uid);
    //提供了一个可以返回所有User对象的方法
    public List<User> selectAll();
    public Integer deleteByUid(Integer uid);
    //添加一条新纪录
    public Integer insert(User user);
    //如果需要添加一个业务处理:先修改接口文件,然后修改mapper.xml文件,修改测试代码或service文件
    public Integer update(User user);
}
