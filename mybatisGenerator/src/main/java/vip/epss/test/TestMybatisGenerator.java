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
import vip.epss.domain.UserinfoExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestMybatisGenerator {

    InputStream resourceAsStream = null;
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;
    UserMapper mapper = null;

    @Before
    public void init() throws IOException {
        //1 加载配置文件
        resourceAsStream = Resources.getResourceAsStream("mybatis_temp.xml");
        //2 获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3 获取sqlSession
        sqlSession = sqlSessionFactory.openSession(true);

        //4 得到mapper
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    public void destroy() throws IOException {
        //6 关闭资源
//        sqlSession1.commit();
        sqlSession.close();
        resourceAsStream.close();
    }

    @Test
    public void testSelectByExample() {
        //5 根据逆向工程提供的接口方法实现数据的方法
        //如何使用逆向工程提供的example,首先创建example对象
        UserExample userExample = new UserExample();
        //创建条件
        UserExample.Criteria criteria = userExample.createCriteria();
        //添加条件的具体约束
        criteria.andUidBetween(2, 8);
        //通过接口的方法调用条件查询
        List<User> users = mapper.selectByExample(userExample);
        for (User user : users
        ) {
            System.out.println(user);
        }
    }

    //删除的案例
    @Test
    public void testDeleteByUid(){
        //删除指定id的数据
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        List<Integer> uids = new ArrayList<>();
        uids.add(10);
        uids.add(12);
        criteria.andUidIn(uids);
        mapper.deleteByExample(userExample);
    }

    //删除的案例
    @Test
    public void testDeleteUserWithUserinfo(){
        //删除指定id的数据
        //假设要删除uid为9
        Integer uid = 9;

        UserinfoMapper userinfoMapper = sqlSession.getMapper(UserinfoMapper.class);
        UserinfoExample userinfoExample = new UserinfoExample();
        UserinfoExample.Criteria criteria = userinfoExample.createCriteria();
        criteria.andFuidEqualTo(uid);
        userinfoMapper.deleteByExample(userinfoExample);

        mapper.deleteByPrimaryKey(uid);



    }

    //查询user的同时查询到对应的userinfo信息
    @Test
    public void testSelectUserAndUserinfo(){
        User user = mapper.selectByPrimaryKeyWithUserinfo(11);
        System.out.println(user.getUsername());
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(user.getUserinfo());
    }
}
