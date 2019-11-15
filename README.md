## SpringBoot构建电商基础秒杀项目
### 项目简介

**通过SpringBoot快速搭建的前后端分离的电商基础项目。项目实现：用户管理，订单，品类，产品，购物车，地址等功能 redis缓存分布式 和 在线支付宝支付暂未实现**。


### 使用到的外部依赖

* ch.qos.logback
* mysql:mysql-connector-java
* com.alibaba:druid
* org.mybatis.spring.boot:mybatis-spring-boot-starter
* org.apache.commons:commons-lang3
* org.hibernate:hibernate-validator
* joda-time:joda-time
* junit:junit
* org.springframework:spring-test
* org.mybatis.generator：mybatis-generator-maven-plugin （插件）
* org.apache.tomcat



&nbsp;
* **统一前端返回格式ServerResponse**
`  private int status;
     private String msg;
     private  T data;`



