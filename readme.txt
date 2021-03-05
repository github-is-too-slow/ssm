ssm整合开发：
1.创建ssm数据库student表
2.创建Maven web项目
3.导入Spring、SpringMVC、mybatis、
     servlet、jsp、mysql驱动、德鲁伊连接池、Jackson依赖
4.修改web.xml文件：
    1）注册DispatcherServlet前端控制器
    2）注册ContextLoaderListener监听器，创建Spring容器
    3）注册字符集过滤器，解决Post请求乱码问题
5.创建三层架构的包
6.写SpringMVC、spring、mybatis主配置文件、数据库属性文件
7.写代码
    1）dao接口、mapper文件
    2）Service接口和实现类
    3）controller后端控制器
    4）实体类
8.jsp页面