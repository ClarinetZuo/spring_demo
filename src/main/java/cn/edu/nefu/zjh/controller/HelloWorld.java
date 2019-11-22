package cn.edu.nefu.zjh.controller;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class HelloWorld {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello"+name);
    }
}
