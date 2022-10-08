package com.gxa.spring06.test;

import com.gxa.spring06.entity.Bean1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    ApplicationContext context = null;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("bean1.xml");
    }
    @Test
    public  void test(){
        Bean1 bean1 = (Bean1) context.getBean(Bean1.class);
        System.out.println(bean1);
    }
}
