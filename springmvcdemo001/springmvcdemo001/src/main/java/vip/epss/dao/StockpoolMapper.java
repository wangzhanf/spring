package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Stockpool;
import vip.epss.domain.StockpoolExample;

import java.util.List;

public interface StockpoolMapper {
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