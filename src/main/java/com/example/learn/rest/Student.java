package com.example.learn.rest;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // This specifies that this class is an entity
public class Student {
    @Id // Specifies the primary key of an entity
    @GeneratedValue // Provides for the specification of generation strategies for the primary keys
    private Long id;
    private String name;
    private String passportNumber;

    public Student() {  // default constructor for JPA
        super();
    }

    public Student(Long id, String name, String passportNumber) {
        super();
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

}