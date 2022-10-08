package com.gxa.spring04;

public class Order {
    private Integer id;
    private String name;

    public Order() {
    }

    public Order(Integer id, String name) {
        System.out.println("======两个参数的构造器使用======");
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
