package vip.epss.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Userinfo implements Serializable {
    private Integer uiid;
    private String phone;
    private String email;
    private Integer fuid;
    private User user;
}
