package vip.epss.service;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public interface ShaccountService {
    long countByExample(ShaccountExample example);

    int deleteByExample(ShaccountExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Shaccount record);

    int insertSelective(Shaccount record);

    List<Shaccount> selectByExample(ShaccountExample example);
    List<Shaccount> selectByExampleWithObject(ShaccountExample example);

    Shaccount selectByPrimaryKey(Integer aid);

    //查找账号时关联查找持有的股票信息
    Shaccount selectByPrimaryKeyWithObject(Integer aid);

    int updateByExampleSelective(@Param("record") Shaccount record, @Param("example") ShaccountExample example);

    int updateByExample(@Param("record") Shaccount record, @Param("example") ShaccountExample example);

    int updateByPrimaryKeySelective(Shaccount record);

    int updateByPrimaryKey(Shaccount record);
}
