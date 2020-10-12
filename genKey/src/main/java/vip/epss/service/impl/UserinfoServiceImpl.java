package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.UserMapper;
import vip.epss.dao.UserinfoMapper;
import vip.epss.domain.User;
import vip.epss.domain.Userinfo;
import vip.epss.service.UserService;
import vip.epss.service.UserinfoService;

@Service(value = "userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo selectByUiid(Integer uiid) {
        Userinfo userinfo = userinfoMapper.selectByUiid(uiid);

        return userinfo;
    }
}
