package cn.edu.nefu.zjh.dao;

import cn.edu.nefu.zjh.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Repository("studentDao")
public class StudentDaoImpl {

    public void addStu(Student student){
        System.out.println("增加学生");
    }
}
