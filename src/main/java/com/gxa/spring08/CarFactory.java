package com.gxa.spring08;

public class CarFactory {
    public static Car getInstance(String car){
        if (car.equals("bmw")){
            BMW bmw = new BMW();
            bmw.setName("bmw");
            return bmw;
        }
        if (car.equals("benz")){
            Benz benz = new Benz();
            benz.setName("benz");
            return benz;
        }
        return null;
    }

}
