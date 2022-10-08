package com.gxa.spring09;

public class Bean03Factory {
    public Bean03 getInstance(){
        System.out.println(" Bean3Factory getInstance....");
        Bean03 bean3 = new Bean03();
        bean3.setName("李思思");
        return bean3;
    }
}
