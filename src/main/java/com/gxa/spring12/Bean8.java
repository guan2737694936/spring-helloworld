package com.gxa.spring12;

import lombok.Data;

@Data
public class Bean8 {
    private String name;
    private Bean9 bean9;

    public Bean8(Bean9 bean9) {
        this.bean9 = bean9;
    }

    public Bean8() {

    }

    public Bean9 getBean9() {
        return bean9;
    }

    public void setBean9(Bean9 bean9) {
        this.bean9 = bean9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
