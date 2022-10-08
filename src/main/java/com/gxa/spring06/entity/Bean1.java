package com.gxa.spring06.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bean1 {
    private Integer id;
    private boolean flag;
    private Double price;

    private Bean2 bean2;

    private List<String> strList;//List类型
    private String[] strArray;//数组
    private Set<String> strSet;//set
    private Map<String,String> map;//map映射
    private Properties properties;//Properties

    private Bean2 bean22;

    private String abc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Bean2 getBean2() {
        return bean2;
    }

    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public String[] getStrArray() {
        return strArray;
    }

    public void setStrArray(String[] strArray) {
        this.strArray = strArray;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Bean2 getBean22() {
        return bean22;
    }

    public void setBean22(Bean2 bean22) {
        this.bean22 = bean22;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
