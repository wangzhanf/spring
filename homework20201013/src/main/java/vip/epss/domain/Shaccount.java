package vip.epss.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
public class Shaccount implements Serializable {
    private Integer aid;

    private String aname;

    private Date ainmarket;

    private List<Stockpool> stockpools;
}