package com.gxa.spring07;

public class Singleton {
    //构造方法私有化
    private Singleton(){

    }
    //提供一个静态方法来获取对象
    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }
    //使用静态内部类
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
}
