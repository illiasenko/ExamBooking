package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.humanitarian.Philosophy;

public class PhilosophyTeacher extends Teacher{

    private String fullname;
    private Philosophy phil;

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
        return "PhilosophyTeacher{" +
                "fullname='" + fullname + '\'' +
                '}';
    }
}
