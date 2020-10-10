package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.RoleMapper;
import vip.epss.domain.Role;
import vip.epss.service.RoleService;

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
        roleMapper.deleteUrByFrid(rid);
        return roleMapper.deleteByRid(rid);

    }
}
