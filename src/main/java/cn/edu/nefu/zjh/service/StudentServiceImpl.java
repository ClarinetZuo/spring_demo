package cn.edu.nefu.zjh.service;

import cn.edu.nefu.zjh.dao.IStudentDao;
import cn.edu.nefu.zjh.dao.impl.StudentDaoImpl;
import cn.edu.nefu.zjh.entity.Student;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class StudentServiceImpl implements IStudentSerivce {

    IStudentDao studentDao = new StudentDaoImpl();
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public void addStudent(Student student) {

        // 增加其他
        studentDao.addStudent(student);
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
