package vip.epss.domain;

public class User {
    private Integer uid;
    private String uname;
    private String upassword;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }

}
