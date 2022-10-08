package com.gxa.spring13.spring13_01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //可以给程序猿提供  自己可以使用代码形式向spring注册bean的定义信息
        //最先执行
        System.out.println("11111111111");

        //使用代码的形式向spring中注册
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.gxa.spring13.spring13_01.Dog");

        //相当于在配置文件中<bean id="dog" class="com.gxa.spring13.spring13_01.Dog"></bean>
        registry.registerBeanDefinition("dog",beanDefinition);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        System.out.println("222222222222222");
    }
}
