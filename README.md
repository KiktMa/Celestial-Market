# Gulimall 项目

## 项目简介
**Gulimall** 谷粒商城项目是一套电商项目，包括前台商城系统以及后台管理系统，基于 SpringCloud、SpringCloud Alibaba、MyBatis Plus实现。是一个 B2C 模式的电商平台，销售自营商品给客户，旨在提供一个强大的、可扩展的在线购物平台。该项目包含了前端和后端的实现，为商家和消费者提供了一种无缝的购物体验。

### 项目架构图
![项目架构图](https://github.com/KiktMa/error-png/blob/master/guli/%E6%95%85%E9%87%8C%E5%95%86%E5%9F%8E-%E5%BE%AE%E6%9C%8D%E5%8A%A1%E6%9E%B6%E6%9E%84%E5%9B%BE.jpg)

### 业务架构图
![业务架构图](https://github.com/KiktMa/error-png/blob/master/guli/%E4%B8%9A%E5%8A%A1%E6%9E%B6%E6%9E%84%E5%9B%BE.jpg)

## 功能特性

- 商品管理：支持商品的添加、编辑、删除和上下架操作。
- 订单管理：实现了订单的创建、支付、发货、退款等功能。
- 用户管理：提供了用户注册、登录、个人信息管理等功能。
- 购物车：支持用户将商品加入购物车，方便批量购买。
- 支付集成：集成了多种支付方式，包括支付宝、微信支付等。
- 优惠券系统：实现了优惠券的领取和使用功能。
- 后台管理：提供了一个功能强大的后台管理系统，用于管理商品、订单、用户等信息。
- 安全性：采用了各种安全措施，保障用户信息的安全性。

## 组织结构
```bash
gulimall
    ├── gulimall-common -- 工具类及通用代码
    ├── renren-generator -- 人人开源项目的代码生成器
    ├── gulimall-auth-server -- 认证中心（社交登录、OAuth2.0、单点登录）
    ├── gulimall-cart -- 购物车服务
    ├── gulimall-coupon -- 优惠卷服务
    ├── gulimall-gateway -- 统一配置网关
    ├── gulimall-order -- 订单服务
    ├── gulimall-product -- 商品服务
    ├── gulimall-search -- 检索服务
    ├── gulimall-seckill -- 秒杀服务
    ├── gulimall-third-party -- 第三方服务
    ├── gulimall-ware -- 仓储服务
    └── gulimall-member -- 会员服务
```

## 后端技术
| 技术           |   说明   |   官网   |
|--------------| ---- | ---- |
| SpringBoot   |    容器+MVC框架  |   https://spring.io/projects/spring-boot   |
| SpringCloudx |   微服务架构   |   https://spring.io/projects/spring-cloud   |
|       SpringCloudAlibaba       |   一系列组件   |   https://spring.io/projects/spring-cloud-alibaba   |
|      MyBatis-Plus        |   ORM框架   |   https://mp.baomidou.com   |
|       renren-generator       |  人人开源项目的代码生成器    |  可在线生成entity、xml、dao、service、vue、sql代码    |
|       Elasticsearch       |   搜索引擎   |  https://github.com/elastic/elasticsearch    |
|      RabbitMQ        |   消息队列   |   https://www.rabbitmq.com   |
|       Springsession       |   分布式缓存   |   https://projects.spring.io/spring-session   |
|       Redisson       |   分布式锁   |  https://github.com/redisson/redisson   |
|       Docker       |   应用容器引擎   |    https://www.docker.com  |
|        OSS      |   对象云存储   |   https://github.com/aliyun/aliyun-oss-java-sdk   |


### 前端技术
| 技术           |   说明   |   官网   |
|--------------| ---- | ---- |
| Vue   |    前端框架  |   https://vuejs.org   |
| Element   |    前端UI框架  |   https://element.eleme.io   |
| node.js   |    服务端的js  |   https://nodejs.org/en   |
| thymeleaf   |    模板引擎  |   https://www.thymeleaf.org   |

## 安装和使用

### 环境要求
- Java 8+
- Spring Boot
- MySQL 数据库
- Maven
- Redis 
- Elasticsearch
- Kibana
- RabbitMQ
- Nginx

### 安装步骤

1.克隆项目到本地：
```bash
git clone git@github.com:KiktMa/gulimall.git 
```
2.maven打包
```bash
mvn install
```