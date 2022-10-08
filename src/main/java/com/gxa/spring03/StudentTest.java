package com.gxa.spring03;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {
    ApplicationContext context;
    @Before
    public void init(){
        //加载配置类形成spring容器
        context = new AnnotationConfigApplicationContext(MyConfig.class);
    }
    @Test
    public void test01(){
        //Bean 通过class获取
        Student student = context.getBean(Student.class);
//        System.out.println(student);

        //通过id来获取
        //在我们不知道id是什么的情况下，我们就来看看spring的容器中有哪些
        String[] names = context.getBeanDefinitionNames();
        for (String name : names){
//            System.out.println(name);
        }

        Student student1 = (Student) context.getBean("student");
        System.out.println(student1);
    }
}
