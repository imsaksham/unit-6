package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ec=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st=ec.getBean(Student.class,"student");
        System.out.println(st);
        College cl=ec.getBean(College.class,"college");
        cl.showDetails();

    }

}
