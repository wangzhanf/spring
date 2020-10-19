package vip.epss.domain;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class User {
    private Integer uid;
    @Size(min = 2,max = 12,message = "{user.username.error}")
    private String username;
    //强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,12}$",message = "{user.password.error}")
    private String password;


}
