package com.gxa.spring12;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean8 {
    ApplicationContext context;
    @Before
    public void init(){

     context = new ClassPathXmlApplicationContext("bean8.xml");

    }
    @Test
    public void test(){
        Bean8 bean8 =  context.getBean(Bean8.class);
        System.out.println(bean8);
    }
}
