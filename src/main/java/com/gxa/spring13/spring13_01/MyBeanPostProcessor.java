package com.gxa.spring13.spring13_01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    //第一步
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //一旦能执行到这里，说明对象已经被实例化了，并且已经赋值好了
        //已经将beanName 和对象传给你，你可以增强
        System.out.println("MyBeanPostProcessor  before ");

        if(bean instanceof Cat){
            Cat cat = (Cat) bean;
            cat.setId(200);
        }
        return bean;
    }
    //第二步:在InitializingBean 之后执行的。 因为再他之后执行的，所以spring又提供了一次机会来做增强
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor  After ");
        if(bean instanceof Cat){
            Cat cat = (Cat) bean;
            cat.setId(300);
        }
        return bean;
    }
}