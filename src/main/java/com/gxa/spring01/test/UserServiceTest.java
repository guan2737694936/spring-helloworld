package com.gxa.spring01.test;

import com.gxa.spring01.entity.User;
import com.gxa.spring01.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    ApplicationContext context;
    @Before
    public void init() {
        //加载spring的配置文件 形成spring的容器
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test01() {
        //向spring容器要 userService
        UserService userService = (UserService) context.getBean("userService");
        //调用userService上的方法
        userService.queryByPage(1);
    }

    @Test
    public void test02() {
        //向spring容器要 userService
        UserService userService = (UserService) context.getBean("userService01");
        //调用userService上的方法
        userService.queryByPage(1);
    }

    @Test
    public void test03() {
        //向spring容器要 userService
        UserService userService = (UserService) context.getBean(UserService.class);
        //调用userService上的方法
        System.out.println(userService);
    }

    @Test
    public void test04() {
        //向spring容器要 userService
        UserService userService = (UserService) context.getBean("userService",UserService.class);
        //调用userService上的方法
        System.out.println(userService);
    }

    @Test
    public void test05(){
        //通过name+参数获取 ,并且可以将参数传到spring为我们构建的对象中去了，想利用我们传进去的参数来给你构建对象
        //1、bean scope 必须设置prototype
        //2、指定对应参数的构造器  和 spring配置文件中的参数构造器
        User user = (User) context.getBean("user", 10, "zs", "zs");
        System.out.println(user);
    }
}