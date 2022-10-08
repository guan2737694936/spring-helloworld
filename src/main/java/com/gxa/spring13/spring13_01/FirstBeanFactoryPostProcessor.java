package com.gxa.spring13.spring13_01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
/**
 * 这是后置处理器
 * 这是一个对BeanFactory增强的后置处理器
 * 增强的是什么？官方推荐，在这里我们可以来操作Bean的定义信息，不推荐对象的实例化相关操作，如果要实例有所增强推荐BeanPostProcessor
 * 在这个后置处理器中， 这时只有 bean的定义信息，bean还没有实例化，也没有赋值
 *
 * 既然是一个能对BeanFactory做增强的，所以在回调方法中，直接就已经将工厂传给你了。
 */
public class FirstBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("FirstBeanFactoryPostProcessor  =====> postProcessBeanFactory ");

        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("cat");

        beanDefinition.setBeanClassName("com.gxa.spring13.sping13_01.Dog");
    }
}
