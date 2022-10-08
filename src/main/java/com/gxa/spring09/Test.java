package com.gxa.spring09;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    ApplicationContext context;
    @Before
    public void init(){
         context = new ClassPathXmlApplicationContext("bean3.xml");
    }
    @org.junit.Test
    public void test(){
        Bean03 bean03 = context.getBean(Bean03.class);
        System.out.println(bean03);
    }
}
