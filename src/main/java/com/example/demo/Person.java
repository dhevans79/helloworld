package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Person {
    public @Id @GeneratedValue Long id;
    public String name;
    public String lastName;
    public Integer age;
    public Date dob;

    public Date created;

    public Person() {
        this.name = null;
        this.lastName = null;
        this.age = null;
        this.dob = null;
        this.id = null;
        this.created = null;
    }

    public Person(String name, String lastName, Integer age, Date dob) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dob = dob;
        this.created = new java.util.Date();
    }

}
