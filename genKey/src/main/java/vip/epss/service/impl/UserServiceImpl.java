package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.UserMapper;
import vip.epss.dao.UserinfoMapper;
import vip.epss.domain.User;
import vip.epss.domain.Userinfo;
import vip.epss.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;


    @Override
    public Integer insert(User user) {
        //先插入用户,然后才能插入用户信息,用户信息中的fuid关联到user表的uid

        System.out.println("前台传过来的user:"+user);
        Integer insert = userMapper.insert(user);
        System.out.println("service层工作:插入了 几条记录  "+insert);
        System.out.println("插入数据后此时user对象的uid"+user.getUid());

        Userinfo userinfo = new Userinfo();
        userinfo.setPhone("1388888888");
        userinfo.setFuid(user.getUid());

        userinfoMapper.insert(userinfo);

        return insert;
    }

    @Override
    public Integer delete(Integer uid) {
        //删除的逻辑是先删除userinfo相关信息然后删除user的信息
        //即先删除从表的信息然后删除总表的信息,为了逻辑清晰,设置一个临时变量
        Integer fuid = uid;
        userinfoMapper.delete(fuid);

        Integer deleteNum = userMapper.delete(uid);
        return deleteNum;
    }

    //根据uid获取唯一一条user信息记录,此处使用了懒加载模式而不是关联查询的模式
    @Override
    public User selectByUid(Integer uid) {
        return userMapper.selectByUid(uid);
    }
}
