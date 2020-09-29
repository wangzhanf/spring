package vip.epss.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
