package vip.epss.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private Integer rid;
    private String rname;
    private String rdes;
    //一个角色应该包含多个用户
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rdes='" + rdes + '\'' +
                ", users=" + users +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdes() {
        return rdes;
    }

    public void setRdes(String rdes) {
        this.rdes = rdes;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role(Integer rid, String rname, String rdes, List<User> users) {
        this.rid = rid;
        this.rname = rname;
        this.rdes = rdes;
        this.users = users;
    }

    public Role() {
    }
}
