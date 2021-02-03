package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.applied.Mathematics;

public class MathTeacher extends Teacher{

    private String fullname;

    @Override
    public String getFullname() {
        return fullname;
    }

    @Override
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "MathTeacher{" +
                "fullname='" + fullname + '\'' +
                '}';
    }
}
