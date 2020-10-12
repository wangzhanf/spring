package vip.epss.vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vip.epss.dao.UserMapper;
import vip.epss.domain.User;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisCache {

    @Test
    public void testFirstLevelCache() throws IOException {
        //1 加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis_temp.xml");
        //2 获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        SqlSession sqlSession1 = sqlSessionFactory.openSession();

        //4 得到mapper
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        mapper1.selectByUid(1);

        //用户演示当执行增加,删除,修改时,一级缓存也会被清空
        User user = new User();
        user.setUsername("ls1");
        user.setPassword("abcd");
        mapper1.insert(user);
        //此时,一级缓存已经被清空,下面的查询语句将会重新查询数据库
        //
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        mapper1.selectByUid(1);
    }
    @Test
    public void testSecondLevelCache() throws IOException {
        //1 加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis_temp.xml");
        //2 获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();

        //4 得到mapper
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        mapper1.selectByUid(1);
        sqlSession1.close();//关闭连接,另外的作用是将一级缓存写入到二级缓存

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        mapper2.selectByUid(1);
    }
}
