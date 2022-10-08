package com.gxa.spring10;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean04 {
    private ApplicationContext context ;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("bean4.xml");

    }

    /**
     * 默认情况下，spring在容器形成的时候都会为我们创建bean 这种叫 非延迟加载
     * 延迟加载： spring容器形成的时候不会为我们创建，而是在我们使用的时候才为我们创建
     *  配置成延迟加载
     *      可以在bean标签：lazy-init="true" 只管当前这个bean
     *      也可以在beans标签： default-lazy-init="true" 管配置文件中的所有的bean
     *
     *     lazy-init="default"  default默认：参考beans上面配置
     */
    @Test
    public void test01(){
//        Bean4 bean4 = context.getBean(Bean4.class);
//        System.out.println(bean4);

    }
}
