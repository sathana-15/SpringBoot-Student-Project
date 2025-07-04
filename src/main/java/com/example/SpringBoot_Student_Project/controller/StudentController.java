package com.example.SpringBoot_Student_Project.controller;

import com.example.SpringBoot_Student_Project.Service.StudentService;
import com.example.SpringBoot_Student_Project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    StudentService hws;

    @GetMapping
    public List<Student> getMethod(){
        return hws.getMethod();
    }

    @GetMapping("/{std_id}")
    public Student getMethodById(@PathVariable int std_id){
        return hws.getMethodById(std_id);
    }


    @PostMapping
    public String postMethod(@RequestBody Student s){
        return hws.postMethod(s);
    }


    @PutMapping
    public String putMethod(@RequestBody Student s1){
        return hws.updateMethod(s1);
    }



    @DeleteMapping
    public String deleteMethod(){
        return hws.deleteMethod();
    }

    @DeleteMapping("/{std_id}")
    public String deleteMethodById(@PathVariable int std_id){
        return hws.deleteMethodById(std_id);
    }
}
