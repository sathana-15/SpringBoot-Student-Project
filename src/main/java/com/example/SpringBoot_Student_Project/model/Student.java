package com.example.SpringBoot_Student_Project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Student {
    private int std_id;
    private String s_name;
    private int s_age;

    public Student(int std_id, String s_name, int s_age) {
        this.std_id = std_id;
        this.s_name = s_name;
        this.s_age = s_age;
    }



    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }
}
