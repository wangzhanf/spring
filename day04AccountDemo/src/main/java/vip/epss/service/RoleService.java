package vip.epss.service;

import vip.epss.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> selectAll();
    public Integer deleteByRid(Integer rid);
}
