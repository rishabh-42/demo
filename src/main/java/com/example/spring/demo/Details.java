package com.example.spring.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Details {

    public Details() {
    }

    public Details(int ids, String username, int age, String gender) {
        this.ids = ids;
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    @Id
    @Column(name = "ids")
    private int ids;

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name="username")

    private  String username;

    @Column(name = "age")
    private int age;

    @Column(name= "gender")
    private String gender;






}
