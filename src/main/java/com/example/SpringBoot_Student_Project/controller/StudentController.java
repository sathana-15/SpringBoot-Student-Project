package com.example.SpringBoot_Student_Project.controller;

import com.example.SpringBoot_Student_Project.Service.StudentService;
import com.example.SpringBoot_Student_Project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService hws;

    @GetMapping("/")
    public List<Student> hello(){
        System.out.println("Hello world!!");
        return hws.getMethod();
    }


    @PostMapping("/add")
    public String postMethod(@RequestBody Student s){
        hws.postMethod(s);
        return "Student added: " + s;

    }

    @PutMapping
    public String putMethod(){
        return hws.putMethod();
    }

    @DeleteMapping
    public String deleteMethod(){
        return hws.deleteMethod();
    }
}
