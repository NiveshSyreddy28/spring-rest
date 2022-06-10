package com.zemoso.springdemo.rest;

import com.zemoso.springdemo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList;

    //define @PostConstruct to load the students data...only once
    @PostConstruct
    public void loadData(){

            studentList = new ArrayList<>();
            studentList.add(new Student("Poornima","patel"));
            studentList.add(new Student("Mario","Rosie"));
            studentList.add(new Student("Mary","Smith"));
    }

    //define an end point for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){

        return studentList;
    }

    //define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        //index into the list to keep it simple

        //check the studentId againist the list size

        if(studentId >= studentList.size() || studentId < 0){
            throw new StudentNotFoundException("Student Id not found -" + studentId);
        }

        return studentList.get(studentId);
    }


}
