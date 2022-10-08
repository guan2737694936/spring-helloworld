package com.gxa.spring04;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
    ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("applicationContext-injection.xml");
    }
    @Test
    public void test01(){
        Order order = (Order) context.getBean("order01",Order.class);
        System.out.println(order);
    }

    @Test
    public void test02(){
        Order order = (Order) context.getBean("order02",Order.class);
        System.out.println(order);
    }

    @Test
    public void test03(){
        Order order = (Order) context.getBean("order03",Order.class);
        System.out.println(order);
    }
}
