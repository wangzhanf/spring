package vip.epss.domain;

import lombok.Data;

@Data
public class Userinfo {
    private Integer uiid;

    private String phone;

    private String email;

    private Integer fuid;

    private User user;


}