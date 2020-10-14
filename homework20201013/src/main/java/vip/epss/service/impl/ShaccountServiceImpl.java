package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.ShaccountMapper;
import vip.epss.dao.StockpoolMapper;
import vip.epss.domain.Shaccount;
import vip.epss.domain.ShaccountExample;
import vip.epss.domain.StockpoolExample;
import vip.epss.service.ShaccountService;

import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */

@Service(value = "shaccountService")
public class ShaccountServiceImpl implements ShaccountService {

    @Autowired
    private ShaccountMapper shaccountMapper;

    @Autowired
    private StockpoolMapper stockpoolMapper;

    @Override
    public long countByExample(ShaccountExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ShaccountExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        StockpoolExample stockpoolExample = new StockpoolExample();
        StockpoolExample.Criteria criteria = stockpoolExample.createCriteria();
        criteria.andFaidEqualTo(aid);
        stockpoolMapper.deleteByExample(stockpoolExample);//删除从表
//        System.out.println(12/0);
        int i = shaccountMapper.deleteByPrimaryKey(aid);//删除主表
        return i;
    }

    @Override
    public int insert(Shaccount record) {
        return 0;
    }

    @Override
    public int insertSelective(Shaccount record) {
        return 0;
    }

    @Override
    public List<Shaccount> selectByExample(ShaccountExample example) {
        return null;
    }

    @Override
    public List<Shaccount> selectByExampleWithObject(ShaccountExample example) {
        return null;
    }

    @Override
    public Shaccount selectByPrimaryKey(Integer aid) {
        return null;
    }

    @Override
    public Shaccount selectByPrimaryKeyWithObject(Integer aid) {
        return shaccountMapper.selectByPrimaryKeyWithObject(aid);
    }

    @Override
    public int updateByExampleSelective(Shaccount record, ShaccountExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Shaccount record, ShaccountExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Shaccount record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Shaccount record) {
        return 0;
    }
}
