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

    public Student getMethodById(int std_id){
        int ind=0;
        boolean flag=false;
        for(int i=0;i<stu.size();i++){

            if(std_id == stu.get(i).getStd_id()){
                System.out.println("Student Fetched : "+stu.get(i).getStd_id()+stu.get(i));
                ind=i;
                flag=true;
                break;
            }

        }

if(flag){
      return stu.get(ind);
}
else{
    return new Student();
}
    }


    public String postMethod(Student s){
        stu.add(s);
        return "Student Added Successfully!! "+s;
    }


    public String updateMethod(Student s1) {
        int ind=0;
        boolean flag=false;
        for(int i=0;i<stu.size();i++){
            if(s1.getStd_id()==stu.get(i).getStd_id()){
                ind=i;
                flag=true;
            }
        }
        if(flag){
            stu.set(ind,s1);
            return "Student Updated Successfully";
        }
        else{
            return "No such Student Exist!!";
        }
    }


    public String deleteMethod(){
        return "This is a Delete Method";
    }

    public String deleteMethodById(int stdId) {
        int ind=0;
        boolean flag=false;
        for(int i=0;i<stu.size();i++){
            if(stdId==stu.get(i).getStd_id()){
                ind=i;
                flag=true;
            }
        }
        if(flag){
            stu.remove(ind);
            return "Student Deleted successfully!!!";
        }
        else{
            return "No Such Student found!!! ";
        }
    }


}
