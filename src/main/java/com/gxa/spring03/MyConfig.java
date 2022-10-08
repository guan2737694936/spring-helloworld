package com.gxa.spring03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    //spring就会将该对象放到spring的容器中,name是方法名

    @Bean
    public Student student(){
        Student student = new Student();
        return student;
    }
}
