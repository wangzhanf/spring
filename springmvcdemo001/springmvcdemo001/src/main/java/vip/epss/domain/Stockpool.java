package vip.epss.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
public class Stockpool implements Serializable {
    private Integer sid;
    @Size(min = 2,max = 12,message = "{stockPool.sname.error}")
    private String sname;
    @NotNull(message = "{stockPool.shold.isNull}")
    private Integer shold;

    private Double sprice;
    @Past(message = "{stockPool.sintime.error}")
    private Date sintime;

    private Integer faid;

    private Shaccount shaccount;
}