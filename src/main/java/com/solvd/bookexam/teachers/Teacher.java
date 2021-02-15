package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.Subject;

public class Teacher{

    private String fullName;

    public Teacher(){
    }
    public Teacher(String fullName){
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}