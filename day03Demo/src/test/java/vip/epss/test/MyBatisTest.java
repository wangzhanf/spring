package vip.epss.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import vip.epss.dao.UserMapper;
import vip.epss.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//mybatis框架的测试程序
public class MyBatisTest {
    private InputStream stream=null;
    private SqlSessionFactory sqlSessionFactory=null;
    private SqlSession sqlSession=null;
    private UserMapper mapper=null;

    //junit单元测试
    @Before
    public void init() throws IOException {
        //1 获取mybatis的主配置文件 ------    mybatis得有一个主配置文件
        stream = Resources.getResourceAsStream("mybatis.xml");
        //2 获得SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        //3 获取SqlSession(对于增删改操作,必须要手动提交)
        sqlSession = sqlSessionFactory.openSession(true);//会自动提交事务
        //4 获取mapper       ----- 每个实体类应该有一个映射的mapper.xml文件  java代码和sql代码分离
        //mybatis是通过接口和mapper文件的映射,通过动态代理的方式自动生成实现类 的
        //默认情况下,idea的配置中只有 resouuces目录下文件会被发布,如果需要发布其他目录文件,需要修改maven配置
//        如果使用下行的方式,代表和JDBC编写没有区别,java代码和sql代码混合在一起了,不便于维护
//        sqlSession.delete(delete from user where uid=1")
        //反射的方式找到具体的映射文件,通过接口文件解析处理
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void destory() throws IOException {
        //6 关闭资源
        sqlSession.close();
        stream.close();
    }


    @Test
    public void test01(){
//        //5 数据操作"
        List<User> users = mapper.selectAll();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }

    @Test
    public void test02(){

//        //5 数据操作"
        Integer uid = mapper.deleteByUid(2);
        System.out.println("已经删除了"+uid+"条记录");
    }

    @Test
    public void test03(){
        Integer insert = mapper.insert(new User("赵柳","123"));
        System.out.println("已经插入了"+insert+"条记录");
    }

    //正常修改的逻辑,应该是先从后端服务器获取要修改的数据,更新后回传数据库


    //模拟常规修改的逻辑
    @Test
    public void test04(){
        // 先去远程数据库获取对应uid的数据
        User user = mapper.selectByUid(1);//需要被修改的用户
        System.out.println("从远程返回的:"+user);
        user.setUsername("张三");
        user.setPassword("999999");
        System.out.println("修改后:"+user);
        Integer integer = mapper.update(user);
        System.out.println("已经修改了"+integer+"条记录");
    }
}
