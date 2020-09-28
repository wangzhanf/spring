package vip.epss.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp implements Serializable {
    private Integer eid;
    private String ename;
    private String edes;//个人介绍,允许使用HTML标签
    private Object eobj;//是否有对象,null的存在
    private Dept dept;//所属的部门
    private List<String> ephone;//电话号码
    private Set<Integer> eluck;//幸运数字,不能重复
    private Map<String, String> erelation;//家庭关系
    private Properties ehobby;//喜欢的运动

    public Emp() {
    }

    public Emp(Integer eid, String ename, String edes, Object eobj, Dept dept, List<String> ephone, Set<Integer> eluck, Map<String, String> erelation, Properties ehobby) {
        this.eid = eid;
        this.ename = ename;
        this.edes = edes;
        this.eobj = eobj;
        this.dept = dept;
        this.ephone = ephone;
        this.eluck = eluck;
        this.erelation = erelation;
        this.ehobby = ehobby;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdes() {
        return edes;
    }

    public void setEdes(String edes) {
        this.edes = edes;
    }

    public Object getEobj() {
        return eobj;
    }

    public void setEobj(Object eobj) {
        this.eobj = eobj;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public List<String> getEphone() {
        return ephone;
    }

    public void setEphone(List<String> ephone) {
        this.ephone = ephone;
    }

    public Set<Integer> getEluck() {
        return eluck;
    }

    public void setEluck(Set<Integer> eluck) {
        this.eluck = eluck;
    }

    public Map<String, String> getErelation() {
        return erelation;
    }

    public void setErelation(Map<String, String> erelation) {
        this.erelation = erelation;
    }

    public Properties getEhobby() {
        return ehobby;
    }

    public void setEhobby(Properties ehobby) {
        this.ehobby = ehobby;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", edes='" + edes + '\'' +
                ", eobj=" + eobj +
                ", dept=" + dept +
                ", ephone=" + ephone +
                ", eluck=" + eluck +
                ", erelation=" + erelation +
                ", ehobby=" + ehobby +
                '}';
    }
}
