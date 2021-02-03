package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.Subject;
import com.solvd.bookexam.subjects.humanitarian.Psychology;

public class PsychologyTeacher extends Teacher{

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
        return "PsychologyTeacher{" +
                "fullname='" + fullname + '\'' +
                '}';
    }
}
