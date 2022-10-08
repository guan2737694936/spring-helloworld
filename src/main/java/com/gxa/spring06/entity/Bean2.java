package com.gxa.spring06.entity;

import lombok.Data;

@Data
public class Bean2 {
    private Integer age;//年龄
    private String gender;//性别

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
