package com.nr.demo.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by nr on 2017/02/11 0011.
 */
@XmlRootElement
public class User {
    private int userId;
    private String name;
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
