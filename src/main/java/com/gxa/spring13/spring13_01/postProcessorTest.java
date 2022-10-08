package com.gxa.spring13.spring13_01;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class postProcessorTest {
    private ApplicationContext context ;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("postprocessor.xml");

    }


    @Test
    public void test01(){
        Object cat = context.getBean("cat");

        System.out.println(cat);

    }
//    @Test
//    public void test02(){
//        Dog dog = context.getBean(Dog.class);
//
//        System.out.println(dog);
//
//    }
}
