package com.example.spring.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @Column(name = "ids")
    private int ids;

    @Column(name="username")
    private  String username;

    @Column(name = "age")
    private int age;

    @Column(name= "gender")
    private String gender;




}
