package com.gxa.spring11;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean6 {
    private ApplicationContext context ;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("bean6.xml");

    }

    /**
     * scope :spring为我们创建bean是单例的还是非单例的
     *      默认是单例的 相当于scope="singleton" 不写默认也是singleton的
     *      非单例(多例，每次获取就是一个不同实例对象) scope="prototype"
     */

    @Test
    public void test01(){
        Bean6 bean6 = context.getBean(Bean6.class);
        Bean6 bean66 = context.getBean(Bean6.class);
        System.out.println(bean6==bean66);//true 引用地址都是相等的

    }
}