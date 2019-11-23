# Spring
## DI的三种方式
- set方式的DI
```xml
<property name="courseHour" value="10"></property>
<property name="courseName" value="BigData"></property>
<property name="teacher" ref="teacher"></property>
```
- 构造器DI
```xml
<constructor-arg value="Kafka" name="courseName"></constructor-arg>
<constructor-arg value="10"></constructor-arg>
<constructor-arg ref="teacher"></constructor-arg>
```
- p命名空间
```xml
<bean id="course" class="cn.edu.nefu.zjh.entity.Course" p:courseHour="300" p:courseName="Kafka" p:teacher-ref="teacher">
```
- 自动装配(只适用于ref类型):使用autowire关键字
```xml
<bean id="course" class="cn.edu.nefu.zjh.entity.Course" autowire="byName"> <!-- 通过id装配-->    <bean id="course" class="cn.edu.nefu.zjh.entity.Course" autowire="byType">
<bean id="course" class="cn.edu.nefu.zjh.entity.Course" autowire="byType"> <!-- 通过类型装配-->
```
也可以在xml中的头文件中统一自动装配:default-autowire="byName"
## 通过注解的方式DI
```xml
<context:component-scan base-package="cn.edu.nefu.zjh.dao"></context:component-scan>
```
### Spring在启动时，会扫描base-package包中的所有类，查找这些类是否有注解@Component("studentDao")，如果有，则将该类加入IOC容器
#### Component细化
- @Repository:Dao
- @Service
- @Controller