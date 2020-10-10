package vip.epss.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
//    用户对应的多个账号信息
    private List<Account> accounts;
    //用户对应的角色信息
    //private List<Role> roles;

    public User() {
    }

    public User(Integer uid, String username, String password, List<Account> accounts) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
