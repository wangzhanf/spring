package vip.epss.service;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Stockpool;
import vip.epss.domain.StockpoolExample;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public interface StockpoolService {
    long countByExample(StockpoolExample example);

    int deleteByExample(StockpoolExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Stockpool record);

    int insertSelective(Stockpool record);

    List<Stockpool> selectByExample(StockpoolExample example);

    //通过外键方式查找
    List<Stockpool> selectByForeignKey(Integer faid);

    Stockpool selectByPrimaryKey(Integer sid);

    Stockpool selectByPrimaryKeyWithObject(Integer sid);

    int updateByExampleSelective(@Param("record") Stockpool record, @Param("example") StockpoolExample example);

    int updateByExample(@Param("record") Stockpool record, @Param("example") StockpoolExample example);

    int updateByPrimaryKeySelective(Stockpool record);

    int updateByPrimaryKey(Stockpool record);
}
