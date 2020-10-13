package vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import vip.epss.dao.UserMapper;
import vip.epss.dao.UserinfoMapper;
import vip.epss.domain.User;
import vip.epss.domain.UserExample;
import vip.epss.domain.Userinfo;
import vip.epss.domain.UserinfoExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestMybatisUserinfo {

    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;
    UserinfoMapper mapper = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatis_temp.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);

        //4 得到mapper
        mapper = sqlSession.getMapper(UserinfoMapper.class);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession1.commit();
        sqlSession.close();
        resourceAsStream.close();
    }

    @Test
    public void testSelectByExample() {
        Userinfo userinfo = mapper.selectByPrimaryKey(4);
        System.out.println(userinfo);
    }
}
