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
6 给类添加 @Component注解   [实现类]

![1601173100609](spring%E5%AE%9E%E8%AE%AD%E7%AC%94%E8%AE%B0.assets/三层结构.png)
