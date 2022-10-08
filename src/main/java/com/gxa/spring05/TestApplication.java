package com.gxa.spring05;

import com.gxa.spring01.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
    ApplicationContext context = null;
    @Before
    public void init(){
        //加载多个配置
//        context = new ClassPathXmlApplicationContext("applicationContext-dao.xml","applicationContext-service.xml");
//        context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        context = new ClassPathXmlApplicationContext("applicationContext-service.xml");
    }
    @Test
    public void test(){
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);
    }
}
