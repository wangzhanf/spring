package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.User;
import vip.epss.domain.Userinfo;

@Repository(value = "userinfoMapper")
public interface UserinfoMapper {
    public Integer insert(Userinfo userinfo);
    public Integer delete(Integer fuid);
    public Userinfo selectByUiid(Integer uiid);
}
