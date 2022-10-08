package com.gxa.spring08;

public class CarFactoryTest {
    public static void main(String[] args) {
        Car car = CarFactory.getInstance("benz");
        System.out.println(car);
    }


}
