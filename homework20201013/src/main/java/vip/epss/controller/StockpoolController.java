package vip.epss.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Shaccount;
import vip.epss.domain.Stockpool;
import vip.epss.service.ShaccountService;
import vip.epss.service.StockpoolService;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */

//Stockpool的controller,
@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StockpoolController {

    @Autowired
    private StockpoolService stockpoolService;

    @Test
    public void testSelectByPrimaryKeyWithObject(){
        Stockpool stockpool = stockpoolService.selectByPrimaryKeyWithObject(1);
        System.out.println(stockpool);
    }
}

