package vip.epss.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Data
//@Setter
//@Getter
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;

}
