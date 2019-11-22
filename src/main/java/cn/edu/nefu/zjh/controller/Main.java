package cn.edu.nefu.zjh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        HelloWorld world = (HelloWorld) ac.getBean("world");
        world.hello();
    }
}
