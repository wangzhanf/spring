package vip.epss.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/27 0027
 * @描述
 */
public class Employee {
    private Integer eid;
    private String ename;
    private Object etest;//测试属性,可以为空
    private User user;//关联用户
    private String edes;//个人兴趣介绍,允许使用简单的HTML标签说明
    private List<Integer> ephone;
    private Set<Integer> eluck;
    private Map<String, Integer> emap;//游戏账号对应的等级
    private Properties erelation;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", etest=" + etest +
                ", user=" + user +
                ", edes='" + edes + '\'' +
                ", ephone=" + ephone +
                ", eluck=" + eluck +
                ", emap=" + emap +
                ", erelation=" + erelation +
                '}';
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

    public Object getEtest() {
        return etest;
    }

    public void setEtest(Object etest) {
        this.etest = etest;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEdes() {
        return edes;
    }

    public void setEdes(String edes) {
        this.edes = edes;
    }

    public List<Integer> getEphone() {
        return ephone;
    }

    public void setEphone(List<Integer> ephone) {
        this.ephone = ephone;
    }

    public Set<Integer> getEluck() {
        return eluck;
    }

    public void setEluck(Set<Integer> eluck) {
        this.eluck = eluck;
    }

    public Map<String, Integer> getEmap() {
        return emap;
    }

    public void setEmap(Map<String, Integer> emap) {
        this.emap = emap;
    }

    public Properties getErelation() {
        return erelation;
    }

    public void setErelation(Properties erelation) {
        this.erelation = erelation;
    }

    public Employee(Integer eid, String ename, Object etest, User user,String edes, List<Integer> ephone, Set<Integer> eluck, Map<String, Integer> emap, Properties erelation) {
        this.eid = eid;
        this.ename = ename;
        this.etest = etest;
        this.user = user;
        this.edes = edes;
        this.ephone = ephone;
        this.eluck = eluck;
        this.emap = emap;
        this.erelation = erelation;
    }
}
