package com.gxa.spring13.spring13_02;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
private ClassPathXmlApplicationContext context ;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("bean-life-cycle.xml");

    }


    @Test
    public void test01(){
//        Object bird = context.getBean("bird");
//
//        context.close();
//
//        System.out.println(bird);

    }
}
