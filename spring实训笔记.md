---
typora-copy-images-to: spring实训笔记.assets
---

# 基本环境的准备

## 基本环境

### JDK

1 解压JDK     d:\javaDev\jdk11.0.5

2 配置环境变量     JAVA_HOME       path

3 测试      命令行     java  -version    /    javac  -version



Maven的配置文件  settings.xml

​	maven    是一个  自动化  依赖 , 构建,项目管理工具

​	建议:更改maven的配置文件  setttings.xml    ,配置国内镜像

​	配置环境变量:    以本机为例     执行文件在  D:\javaDev\ideaIU-2020.2.1.win\plugins\maven\lib\maven3

​		配置MAVEN_HOME   和path    

​       测试:    mvn -v

​	



Idea的基本配置,确保项目建立方便

工作区和项目  以及   项目和模块   的关系

​	idea中的project相当于eclipse中的workspace

​	建议的方法:创建一个空目录,通过idea打开,相当创建了一个空白项目

​	idea中的module相当于eclipse中的project

### Idea中的基本配置

修改文件编码

![1601172928457](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601172928457.png)

编译器

![1601173004475](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601173004475.png)

maven的配置

![1601173100609](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601173100609.png)

tomcat

mysql

通过junit进行单元测试[注意scope的范围配置]

## 注意点:

JDK的版本配置

项目和模块的关系



高内聚,低耦合

# 如何引入spring的框架

通过仓库查询框架的依赖坐标(GAV)

1\通过maven的官网      https://mvnrepository.com/

2\通过镜像站点    https://maven.aliyun.com/mvn/guide

# 如何创建第一个spring的项目

创建一个moudle

![1601177846425](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601177846425.png)

选择创建一个maven项目

![1601177899931](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601177899931.png)

修改GAV配置

![1601178159364](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601178159364.png)

此时,项目使用了maven作为构建管理工具,maven的主配置文件叫做   pom.xml   

修改pom文件,导入依赖包

![1601178395571](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601178395571.png)

查看导入的依赖包

![1601178599500](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1601178599500.png)

# spring体系结构

![image-20200924220901044](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/image-20200924220901044.png)

# 第一个Spring Hello实例

创建一个实体类,提供getter和setter方法

创建Spring的主配置文件Beans.xml

创建一个测试类,


# spring 通过java配置类的方式装配Bean
1 创建实体类(所有属性都提供setter和getter,覆写toString,提供无参和有参构造函数)
2 创建配置类 使用@configuration修饰类   使用   @Bean修饰方法,方法返回实体类的对象
3 创建测试类   使用主方法进行测试 ,创建 AnnotationConfigApplicationContext  超级工厂(IOC容器)通过 通过 getBean获取其中注册的Bean对象 



# spring  通过xml的配置方式装配Bean
1 创建实体类(所有属性都提供setter和getter,覆写toString,提供无参和有参构造函数)
2 创建配置文件(在src目录下创建Beans.xml)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="secondHello" class="vip.epss.domian.Hello">

    </bean>
</beans>
```
3 创建测试类:   通过   FileSystemXmlApplicationContext  获取  context容器,

# 使用junit进行单元测试
传统的测试方式,缺陷在于需要将运行代码放在main方法执行
1 导入junit的包(导入依赖)      
2 编写测试类:通过@Test  注解测试方法

# 目前获取applicationContext的方式有  4种
    AnnotationConfigApplicationContext
    FileSystemXmlApplicationContext
    XmlBeanFactory
    ClassPathXmlApplicationContext
# IDEA常用快捷键
打开设置    ctrl+shift+s

剪切行     ctrl+X

删除行     ctrl+Y

重制行     ctrl+D

查看类关系  ctrl+H

定位       ctrl+N或者连续两次shift

#IDEA中编写markDown格式文件的常用格式
\```     输入代码块

**      粗体

`![name](imgPath)`    插入图片

# 本章节的常见注解
@Configuration  用于修饰类,标明该类是一个java配置类
@Bean   用于修饰方法,标明该方法的返回值是一个需要纳入到applicationContext的Bean
@Test   用于修饰方法,junit单元测试方法的声明
@RunWith(SpringJUnit4ClassRunner.class)   用于修饰类,标明该类中的方法测试时使用spring的容器单元作为基础
@ContextConfiguration(classes = xxxx.class)    用于修饰类,标明该类中的方法运行时使用的applicationContext来自于一个配置类
@ContextConfiguration(locations = {"classpath:xxx.xml","classpath:yyy.xml"})    用于修饰类,标明该类中的方法运行时使用的applicationContext来自于一些xml配置文件
@Autowired  用于修饰属性,标明该属性是由applicationContext容器中的Bean自动匹配注入







# 昨日回顾
如何使用单元测试 junit
测试的spring框架的工作

1 创建一个模块  ,
2 修改pom的配置文件
    指定maven的编码和jdk的版本
    导入依赖包,  spring-context    junit
3 创建实体类[空参和有参构造,setter和getter方法,toString方法  alt+insert]

4 创建一个测试类

5 向容器(超级工厂) 添加Bean[配置类,xml配置文件,注解的方法]

6 创建一个配置类[@Configuration   @Bean]

7 创建一个spring的xml配置文件

7  spring的获取容器的方式[4种]
    
    
    
设计模式:[套路]
    单例,代理,工厂,观察者
    MVC 
    三层结构(表现层,service,dao)
    
    


#  向Bean注入数据的方式
    构造方法注入:<constructor-arg>
    setter方法注入:<property>


​    
​    
# Spring整合junit进行单元测试
 1  导入  spring-test
 2 编写测试类   


 # 注入各种类型参数
 1 创建一个module
 2 修改pom文件
 ```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>vip.epss</groupId>
    <artifactId>DiDemo</artifactId>
    <version>0.1-SNAPSHOT</version>


    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.2.6.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>5.2.6.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>

</project>
 ```

3 创建2个实体类,  员工类  Emp   部门类  Dept

4 创建Beans.xml,尝试多种参数的注入
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<!--    首先应该创建Dept的bean-->
    <bean id="dept" class="vip.epss.domain.Dept">
<!--        注入的方式有两种,构造器\setter-->
        <property name="did" value="101"></property>
        <property name="dname">
            <value>市场部</value>
        </property>
    </bean>

<!--    创建Emp的bean-->
    <bean id="emp" class="vip.epss.domain.Emp">
        <property name="eid" value="1007"></property>
        <property name="ename" value="zhangsan"></property>
        <property name="dept" ref="dept"></property>
        <property name="dept.did" value="110"></property>
<!--        第一种方式,转义符-->
<!--        <property name="edes" value="&lt;strong&gt;我很厉害&lt;//strong&gt;"></property>-->
<!--        第二种方式:CDATA-->
        <property name="edes">
            <value>
                <![CDATA[<strong>我很厉害</strong>]]>
            </value>
        </property>
<!--        <property name="eobj" value="null"></property>-->
        <property name="eobj">
            <null></null>
        </property>
        <property name="ephone">
            <list>
                <value>13100000000</value>
                <value>13999999999</value>
            </list>
        </property>
        <property name="eluck">
            <set>
                <value>6</value>
                <value>6</value>
                <value>8</value>
                <value>99</value>
            </set>
        </property>
        <property name="erelation">
            <map>
                <entry>
                    <key><value>father</value></key>
                    <value>zhangdasan</value>
                </entry>
                <entry>
                    <key><value>mother</value></key>
                    <value>lisi</value>
                </entry>
            </map>
        </property>
        <property name="ehobby">
            <props>
                <prop key="王者荣耀">30</prop>
                <prop key="LOL">432</prop>
            </props>
        </property>
    </bean>
</beans>
```
5 编写测试类
```java
package vip.epss.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.epss.domain.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class TestArgs {

    @Autowired
    private Emp emp;

    @Test
    public void test01(){
        System.out.println(emp);
        System.out.println(emp.getEobj() == null);
    }
}

```
注入:依赖注入   DI     ,

spring中的自动注入中,默认使用的是byType

在spring中,默认的bean都是单例模式,应用程序中修改的bean对象都是同一个
如果需要每使用一次bean创建一个实例  ,需要指定bean标签的scope为prototype

spring中通过<import>标签整合多个配置文件,一般情况按照分层整合



@Configuration
@Bean
@Test
@RunWith
@ContextConfiguration
@AutoWired




# 通过注解的方式进行spring的配置
1 创建一个module,引入依赖包
2 创建项目的结构    三层结构  (表示层(MVC),业务层(service),持久层(dao))
3 创建实体类  
4 创建项目结构
5 创建配置文件 
6 给类添加 @Component注解   [给实现类添加而不是给接口添加]

![1601173100609](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/三层结构.png)


# MyBatis
iBatis的后续版本
持久层框架,进行数据库的访问
包括SQLMap(sql和java的分离)   和 DAO
MyBatis是一个ORM的半自动化框架
    ORM     对象关系映射[类--表,属性--字段,实例对象--记录,属性的类型应该兼容字段的类型]
    半自动化代表我们可以定制
    
## 使用MyBatis
先决条件是:有数据库 , 需要数据库的驱动程序(maven导入)

# Idea链接MySQL数据库

# MyBatis的基本使用
1 创建一个moudle模块  (maven)
    ```xml
    <properties>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
            <maven.compiler.source>11</maven.compiler.source>
            <maven.compiler.target>11</maven.compiler.target>
        </properties>
    ```
2 修改pom文件导入依赖包[pom文件修改后一定要刷新]
    mybatis     mysql-connector
3 创建mybatis的主配置文件   mybatis.xml
```xml

```
4 创建sql mapper文件   .xml格式

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!--
dao层接口和mapper文件一般都是同名
    UserMapper.xml           接口文件应该是    UserMapper.java
    mapper文件中的namespace属性指向 接口
    id指向 接口中的方法[id值和接口中的方法名相同]
    parameterType  就是方法的形参
    resultType   就是方法的返回值,如果是集合类型,使用元素类型表示
-->

<mapper namespace="vip.epss.dao.UserMapper">
    <select id="selectAll" resultType="vip.epss.domain.User">
        select * from user
    </select>
</mapper>
```

5 测试程序
```java
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
```



#  Spring整合MyBatis
目前我们整合的基本思路都是   xxx框架整合到  spring中

1 导入相关的依赖包
    spring-jdbc
    spring-tx
    mybatis-spring整合包
    数据库连接池c3p0   (dbcp     c3p0    druid)
2 配置spring的主配置文件
```xml
<!--    1 spring去接管mybatis的连接数据库的能力-->
    <bean id="comboPooledDataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="driverClass" value="com.mysql.jdbc.Driver"></property>
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/java6"></property>
        <property name="user" value="root"></property>
        <property name="password" value="mysql"></property>

        <property name="maxPoolSize" value="80"></property>
    </bean>
<!--    2 由Spring去管理SqlSessionFactory的创建-->
    <bean id="sessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="comboPooledDataSource"></property>
<!--        配置别名映射-->
        <property name="typeAliasesPackage" value="vip.epss.domain"></property>
    </bean>
<!--    3 让Spring配置可以扫描到的mapper文件,让MyBties可以扫描并匹配-->
    <bean id="mapperScannerConfigurer" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="vip.epss.dao"></property>
    </bean>

```




# 特别提醒,  spring的5.2.x  和  c3p0 的0.9.1.2  不能一起工作
spring 5.1.X   和   com.mchange的c3p0 的  0.9.5.2 可以匹配工作

课堂任务:创建一个实体类  Account   ,通过controller模拟实现从A账号到B账号转账100元的操作

十一作业:
网上商城系统的后台实现:   订单,商品,商品种类,用户表
                    (通过resultType,通过resultMap实现)


课堂任务:最简答的CRUD操作
1.三层结构(表现,业务spring(mybatis-spring),持久mybatis+mysql驱动+C3P0), 导入相关的依赖包 ,创建结构
2.







# MyBatis的查询

项目过程中大部分的应用都是查询

CUD都需要手动提交,  openSession通过传递boolean值  true可以设置session为自动提交(只针对于CUD)

查仅仅是读取:对于查询操作关键在于对象的组装,查询的数据如果多次使用需要使用缓存机制

查找一个用户的所有订单,用户在浏览站点的时候多次调用,需要使用到缓存机制

## 关联查询

数据库范式[范式级别越高数据冗余度越低,消耗资源越多]

一对一[用户登录表uid,uname和用户信息表userinfoid,userinfoImage,uid]

一对多[一个用户uid可能有多个订单(orderId,xxxxx,uid)

多对一[多个订单属于一个用户]

多对多[学生和老师的关系]      stuid,stuname       中间表 {stuid    teacherid }      teacherid   teachername

指导原则:

​	在数据表中的表现是通过主键和外键关联

​	多对多关系,需要使用中间表关联,中间表不需要实体类对应

​	实体类中,对象中包含对应对象的引用或者对应对象的集合

​	如果使用ORM的框架,myBaits使用resultMap进行映射

​	

## 代码示例:一对一映射

一个用户有多个账号

1 创建用户实体类和数据表

2 修改dao的接口xml文件

3 修改service

4 修改controller的测试方法





## 代码示例:一对多

查阅一个用户的多个账号信息

1 修改实体类,添加集合引用

2 创建mapper文件和接口文件	

3 修改service

4 实现controller层



## 代码示例:多对多

用户的多种角色分配

1 创建一个角色实体,数据表

2 创建实体类[多对多的本质是双向的一对多]





要求: 创建一个用户的时候创建一条用户信息记录.





# SQL中文乱码问题[报错]

1,创建数据库时使用

```sql
create database java6 default character set 'utf8';
```

2 创建数据表时添加

```
default character set 'utf8'
```

3 传输出现乱码,数据库的链接URL

```
jdbc:mysql://localhost:3306/java6?useUnicode=true&amp;characterEncoding=utf8
```



# 分页查询[通过拦截器实现]

本质就是查询指定数量指定位置的记录

1 引入依赖包

```xml

        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper</artifactId>
            <version>3.4.2</version>
        </dependency>
```

2 修改 spring的主配置文件

```xml
<!--        配置pageHelper-->
        <property name="plugins">
<!--            配置pagehelper的拦截器-->
            <bean class="com.github.pagehelper.PageInterceptor">
                <property name="properties">
                    <props>
<!--                        数据库方言-->
                        <prop key="helperDialect">mysql</prop>
<!--                        页码合理化,负页则为1,无限大值为最大页码数-->
                        <prop key="reasonable">true</prop>
                    </props>
                </property>
            </bean>
        </property>
    </bean>
```

3 controller层代码引用封装

```java
//分页插件的初始化 pn 当前页码数,   每页的记录数
        PageHelper.startPage(1, 8);

        List<Role> roles = roleService.selectAll();
        //将获取到的记录集合封装到pageInfo对象中
        PageInfo<Role>  pageInfo = new PageInfo<>(roles);
```



mybatis建议使用  3.5.3



# 运行的状态需要详细了解

传统使用的是控制台输出

使用日志方式

日志使用时候注意:   日志门面(接口) 和 日志实现(实现类)

推荐使用log4j





# 懒得重复编写setter和getter时可以使用lombok

1 引入依赖包

```xml
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
            <scope>provided</scope>
        </dependency>
```

2 给实体类添加注解

```java
@Data
//@Setter
//@Getter
public class User implements Serializable {
```

3 idea中添加插件

![1602474908852](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/1602474908852.png)





# 案例:懒加载

## 1 引入日志依赖  log4j

## 2 编写日志文件 log4j.properties

## 3 创建mybatis的配置文件,mybatis.xml ,编写懒加载等设置

## 4  在spring的主配置文件中加载mybatis的配置文件

## 5 编写mapper的接口和xml文件   通过asscocation+javaType,实现懒加载过程



# 缓存

只针对于查询操作

myBatis的缓存存在两种

一级缓存: 作用域sqlSession, close或者 flush时清空[当执行CUD操作后也会清空],一级缓存无需配置自动开启[存在于同一方法栈的空间---内存-->适合于小型缓存]

二级缓存:作用域 mapper文件,   一般存储于硬盘空间, 缓存的快慢取决于IO的速度,二级缓存默认是关闭的,可以使用mybatis或者第三方的二级缓存,默认二级缓存不会自动添加内容,需要手动关闭上一次的session



# 逆向工程

目的:通过数据表按照ORM的思想自动生成对应的pojo(domain)   ,  mapper的接口    ,mapper的xml文件

## 具体实现

1 导入相应的依赖包

```xml
<!--    java版本约束-->
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>

    </properties>

    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.3</version>
        </dependency>
    </dependencies>
```

2 编写 运行文件

```java
package vip.epss.utils;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MBGR {

    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定配置文件
        File configFile = new File("src/main/resources/mybatisGR.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    // 执行main方法以生成代码
    public static void main(String[] args) throws IOException, XMLParserException {
        try {
            MBGR mbgr = new MBGR();
            mbgr.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
```



3 编写配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN" "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <!--  <properties resource="mybatis.properties" />
         -->
<!--    引入的jar包-->
<!--    <classPathEntry location="该jar包的位置\mysql\mysql-connector-java\8.0.15\mysql-connector-java-8.0.15.jar" />-->
    <context id="msqlTables" targetRuntime="MyBatis3">
<!--        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"></plugin>-->
<!--        配置数据库连接-->
        <jdbcConnection connectionURL="jdbc:mysql://localhost:3306/java6"
                        driverClass="com.mysql.jdbc.Driver" password="mysql" userId="root">

            <property name="nullCatalogMeansCurrent" value="true"/>
        </jdbcConnection>
<!--        强制类型转换-->
        <javaTypeResolver>
            <property name="forceBigDecimals" value="true" />
        </javaTypeResolver>
<!--        实体类-->
        <javaModelGenerator targetPackage="vip.epss.domain" targetProject="./src/main/java">
            <property name="enableSubPackages" value="true"/>
            <!-- 从数据库返回的值被清理前后的空格  -->
            <property name="trimStrings" value="false" />
        </javaModelGenerator>
<!--        mapper接口 文件的配置-->
        <sqlMapGenerator targetPackage="vip.epss.dao" targetProject="./src/main/java">
            <property name="enableSubPackages" value="false"/>
        </sqlMapGenerator>
        <!--        mapperXML文件位置 文件的配置-->
        <javaClientGenerator type="XMLMAPPER" targetPackage="vip.epss.dao" targetProject="./src/main/java">
            <property name="enableSubPackages" value="true"/>
        </javaClientGenerator>

        <!--数据库表生成-->
        <table tableName="user" domainObjectName="User">
        </table>
        <table tableName="userinfo" domainObjectName="Userinfo">
        </table>
    </context>
</generatorConfiguration>

```

## 总结问题

1 在idea的module下创建时存在  不报错也不生成

解决的办法:  所有的路径必须使用绝对路径[包括数据库驱动的路径]

2 生成的注释过多,简化注释的输出

```xml
<commentGenerator>
<!--            压制所有的注释生成-->
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>
```



3 生成的代码大而全,但是有可能不能满足多表联查的需要





# 课堂练习

需要引入 lombok简化 setter等编写

引入mybatis的测试程序,结合junit测试(@Before和@After)Example的使用



需求:查找user时同时查找对应的userinfo信息(多表 1 对1 关系)

目前的方法:

1 使用join方式   [多个where连接]

2 使用resultMap + select(对应知识点,懒加载)    

​	

使用懒加载的方式









今日作业:

一对多的关联查询

使用spring的注入方式[使用spring接管mybatis的mapper的注入]

编写业务类型:   一个股票账户持有的所有股票

查询:

查询账号的时候将该账号所有的股票信息展示

查询某支股票的时候列出持有该股票用户的信息



通过spring配置AOP的事务增强

1 引入依赖的jar包    spring-aop      ,aspect,    织入包   aspectjweaver

2 修改spring的配置文件 事务声明( 需要依赖     jdbc    tx    )     







