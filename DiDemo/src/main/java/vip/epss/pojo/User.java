package vip.epss.pojo;

import java.io.Serializable;

//pojo所谓的简单java类 ,目的是充当model,特点  空参\有参构造\setter\getter方法\覆写toString\实现序列化接口
public class User implements Serializable {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
