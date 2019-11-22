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