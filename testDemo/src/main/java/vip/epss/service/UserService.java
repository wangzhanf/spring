package vip.epss.service;

import vip.epss.pojo.User;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/26 0026
 * @描述
 */
public interface UserService {
    public User findUser(String name, String password);
}
