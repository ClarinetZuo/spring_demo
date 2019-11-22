import cn.edu.nefu.zjh.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class Test {

    public static void main(String[] args) {

        learnWithIOC();
    }

    public static void testIOC() {
        //        Student student = new Student();
//        student.setStuName("zjh");
//        student.setStuAge(25);
//        student.setStuNo(20124532);
//        System.out.println(student);
        // Spring 上下文对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        // 从IOC容器中获取这个对象
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }

    public static void testCourseFactory() {
        Student student = new Student();
        // 通过简单工厂，集中管理course
        student.learn("java");
    }

    public static void learnWithIOC(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        Student student = (Student) ac.getBean("student");

        student.learn("javaCourse");
    }
}
