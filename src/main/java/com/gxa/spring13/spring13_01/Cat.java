package com.gxa.spring13.spring13_01;

import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean {
    private Integer id=100;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("------- cat   InitializingBean-----------");
    }
}
