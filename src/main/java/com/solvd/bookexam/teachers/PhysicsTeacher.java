package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.applied.Physics;

public class PhysicsTeacher extends Teacher{

    private String fullname;

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "PhysicsTeacher{" +
                "fullname='" + fullname + '\'' +
                '}';
    }
}
