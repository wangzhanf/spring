package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;

import java.util.List;

public interface ShaccountMapper {
    long countByExample(ShaccountExample example);

    int deleteByExample(ShaccountExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Shaccount record);

    int insertSelective(Shaccount record);

    List<Shaccount> selectByExample(ShaccountExample example);

    Shaccount selectByPrimaryKey(Integer aid);

    //查找账号时关联查找持有的股票信息
    Shaccount selectByPrimaryKeyWithObject(Integer aid);

    int updateByExampleSelective(@Param("record") Shaccount record, @Param("example") ShaccountExample example);

    int updateByExample(@Param("record") Shaccount record, @Param("example") ShaccountExample example);

    int updateByPrimaryKeySelective(Shaccount record);

    int updateByPrimaryKey(Shaccount record);
}