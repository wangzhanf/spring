package vip.epss.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Stockpool implements Serializable {
    private Integer sid;

    private String sname;

    private Integer shold;

    private Double sprice;

    private Date sintime;

    private Integer faid;

    private Shaccount shaccount;
}