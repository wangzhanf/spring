package vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import vip.epss.dao.ShaccountMapper;
import vip.epss.dao.StockpoolMapper;
import vip.epss.domain.Shaccount;
import vip.epss.domain.Stockpool;

import java.io.IOException;
import java.io.InputStream;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/13 0013
 * @描述
 */
public class MyBatisTest {
    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatis_junittest.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession1.commit();
        sqlSession.close();
        resourceAsStream.close();
    }


    //查询Shaccount的同时查询持有的的Stockpool信息
    @Test
    public void testShaccountSelectByPrimaryKeyWithObject(){
        ShaccountMapper shaccountMapper = sqlSession.getMapper(ShaccountMapper.class);
        Shaccount shaccount = shaccountMapper.selectByPrimaryKeyWithObject(1);
        System.out.println(shaccount.getAname());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (Stockpool stockpool:shaccount.getStockpools()
        ) {
            System.out.println(stockpool);
        }
    }

    //查询Stockpool的同时查询持有者Shaccount的信息
    @Test
    public void testStockpoolSelectByPrimaryKeyWithObject(){
        StockpoolMapper stockpoolMapper = sqlSession.getMapper(StockpoolMapper.class);
        Stockpool stockpool = stockpoolMapper.selectByPrimaryKeyWithObject(1);
        System.out.println(stockpool);
    }
}
