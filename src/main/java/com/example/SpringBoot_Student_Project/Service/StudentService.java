package com.example.SpringBoot_Student_Project.Service;

import com.example.SpringBoot_Student_Project.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> stu = new ArrayList<>(
            Arrays.asList( new Student(1,"sathana",25),
                           new Student(2,"Ramya",21))
    );


    public List<Student> getMethod(){
      return stu;
    }

    public String postMethod(Student s){
       stu.add(s);
       return "Added";
    }

    public String putMethod(){
        return "This is a Put Method";
    }

    public String deleteMethod(){
        return "This is a Delete Method";
    }
}
