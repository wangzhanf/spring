package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.StockpoolMapper;
import vip.epss.domain.Stockpool;
import vip.epss.domain.StockpoolExample;
import vip.epss.service.StockpoolService;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */

@Service(value = "stockpoolService")
public class StockpoolServiceImpl implements StockpoolService {

    @Autowired
    private StockpoolMapper stockpoolMapper;

    @Override
    public long countByExample(StockpoolExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(StockpoolExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return 0;
    }

    @Override
    public int insert(Stockpool record) {
        return 0;
    }

    @Override
    public int insertSelective(Stockpool record) {
        return stockpoolMapper.insertSelective(record);
    }

    @Override
    public List<Stockpool> selectByExample(StockpoolExample example) {
        return null;
    }

    @Override
    public List<Stockpool> selectByForeignKey(Integer faid) {
        return stockpoolMapper.selectByForeignKey(faid);
    }

    @Override
    public Stockpool selectByPrimaryKey(Integer sid) {
        return stockpoolMapper.selectByPrimaryKey(sid);
    }

    @Override
    public Stockpool selectByPrimaryKeyWithObject(Integer sid) {
        return stockpoolMapper.selectByPrimaryKeyWithObject(sid);
    }

    @Override
    public int updateByExampleSelective(Stockpool record, StockpoolExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Stockpool record, StockpoolExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Stockpool record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Stockpool record) {
        return 0;
    }
}
