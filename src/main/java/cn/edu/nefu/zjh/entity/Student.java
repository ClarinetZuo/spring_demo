package cn.edu.nefu.zjh.entity;

import cn.edu.nefu.zjh.course.HtmlCourse;
import cn.edu.nefu.zjh.course.ICourse;
import cn.edu.nefu.zjh.course.JavaCourse;
import cn.edu.nefu.zjh.factory.CouresFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class Student {

    private int stuNo;
    private String stuName;
    private int stuAge;
    public Student(){

    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public void learnJava(){
        ICourse course = new JavaCourse();
        course.learn();
    }
    public void learnHtml(){
        ICourse course = new HtmlCourse();
        course.learn();
    }

    public void learn(String courseName){
//        CouresFactory.getCourse(courseName).learn();
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        ICourse course = (ICourse)ac.getBean(courseName);
        course.learn();
    }
}
