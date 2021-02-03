package com.solvd.bookexam.teachers;
import com.solvd.bookexam.subjects.humanitarian.English;

public class EnglishTeacher extends Teacher{

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
        return "EnglishTeacher{" +
                "fullname='" + fullname + '\'' +
                '}';
    }
}
