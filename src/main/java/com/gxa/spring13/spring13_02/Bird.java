package com.gxa.spring13.spring13_02;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Bird implements InitializingBean , DisposableBean {
    private String name;
    Bird(){
        System.out.println(" Bird  实例化 .......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(" bird 赋值........");
        this.name = name;
    }
    //自定义的初始化方法
    public void init(){
        System.out.println("bird初始化........");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }
//自定义的destroy方法
    public void destroy02() throws Exception {
        System.out.println("自定义的  destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("InitializingBean  的 after方法....");
    }
}
