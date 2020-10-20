package vip.epss.service;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;
import vip.epss.domain.User;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public interface UserService {
    public abstract User selectUser(User user);
    
    public abstract User selectByPrimaryKey(Integer uid);
    public abstract List<User> select();
    public abstract Integer insert(User user);
    public abstract Integer delete(Integer uid);
    public abstract Integer update(User user);
}
