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






