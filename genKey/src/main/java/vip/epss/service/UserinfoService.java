package vip.epss.service;

import vip.epss.domain.User;
import vip.epss.domain.Userinfo;

public interface UserinfoService {
    public Userinfo selectByUiid(Integer uiid);
}
