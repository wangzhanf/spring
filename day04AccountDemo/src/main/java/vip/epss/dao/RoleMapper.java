package vip.epss.dao;

import vip.epss.domain.Role;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RoleMapper {
    //查询所有的角色信息
    public List<Role> selectAll();
    //删除相应角色
    public Integer deleteByRid(Integer rid);
    public Integer deleteUrByFrid(Integer frid);

    public List<Role> selectCondition(Map map);
}
