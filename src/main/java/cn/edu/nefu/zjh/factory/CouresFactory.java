package cn.edu.nefu.zjh.factory;

import cn.edu.nefu.zjh.course.HtmlCourse;
import cn.edu.nefu.zjh.course.ICourse;
import cn.edu.nefu.zjh.course.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class CouresFactory {

//    public static ICourse getCourse(String courseName){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
//        if (courseName.equals("java")){
//            return (ICourse)ac.getBean("javaCourse");
//        }else {
//            return (ICourse)ac.getBean("htmlCourse");
//        }
//    }
}
