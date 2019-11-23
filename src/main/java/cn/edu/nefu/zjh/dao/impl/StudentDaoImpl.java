package cn.edu.nefu.zjh.dao.impl;

import cn.edu.nefu.zjh.dao.IStudentDao;
import cn.edu.nefu.zjh.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * author:Zuo Junhao
 * NEFU
 */
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {

    public void addStudent(Student student) {
        System.out.println("增加学生");
    }
}
