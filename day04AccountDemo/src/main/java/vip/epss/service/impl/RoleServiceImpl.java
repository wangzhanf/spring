package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.RoleMapper;
import vip.epss.domain.Role;
import vip.epss.service.RoleService;

import java.util.HashMap;
import java.util.List;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public Integer deleteByRid(Integer rid) {

//        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("min",5);
//        stringIntegerHashMap.put("max",8);
        roleMapper.deleteUrByFrid(rid);
        return roleMapper.deleteByRid(rid);



    }
}
