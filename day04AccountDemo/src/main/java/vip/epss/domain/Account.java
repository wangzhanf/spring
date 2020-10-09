package vip.epss.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer aid;//账号id
    private String aname;//账号名称
    private Double balance;//余额

    //getter和setter   toString,空参,全参构造器


    public Account(Integer aid, String aname, Double balance) {
        this.aid = aid;
        this.aname = aname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account() {
    }
}
