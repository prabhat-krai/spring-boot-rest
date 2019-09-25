package com.example.learn.rest;

public class StudentNotFound extends RuntimeException{

    public StudentNotFound(String exception) {
        super(exception);
    }
}
