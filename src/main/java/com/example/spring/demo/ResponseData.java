package com.example.spring.demo;

import javax.validation.constraints.Size;

public class ResponseData {


    @Size (min = 3 , max=5 , message = "Galat hai")
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
