package vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vip.epss.dao.UserMapper;
import vip.epss.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void test() throws IOException {
        //1 加载mybatis的主配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //2 获得SqlSessionFactory对象,相当于以前的  connection对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3 获取SqlSession()
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4 获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //5 执行sql
        List<User> users = mapper.selectAll();
        //6 输出结果
        for (User user:users
             ) {
            System.out.println(user);
        }
    }

    @Test
    public void testDelete() throws IOException {
        //1 加载mybatis的主配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //2 获得SqlSessionFactory对象,相当于以前的  connection对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3 获取SqlSession()
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动提交方式
        //4 获取mapper对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //5 执行sql
        Integer integer = mapper.deleteByUid(3);

//        sqlSession.commit();//提交
        //6 输出结果
        System.out.println("共有"+integer+"条记录被删除了");
    }
}
