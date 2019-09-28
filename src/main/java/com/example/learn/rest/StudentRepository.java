package com.example.learn.rest;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 /*
     We are extending JPA repo using two generics - Student and Long.
     Student is an entity that is being managed and primary key of student is Long.
    */
}

/*
 The functions have not been written yet.
 Learning to use JPA to query data
*/
