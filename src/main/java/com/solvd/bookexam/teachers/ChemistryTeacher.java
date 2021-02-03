package com.solvd.bookexam.teachers;

import com.solvd.bookexam.subjects.Subject;
import com.solvd.bookexam.subjects.applied.Chemistry;

public class ChemistryTeacher extends Teacher{

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
        return "ChemistryTeacher{" +
                "fullname='" + fullname + '\'' +
//				", chem=" + chem +
                '}';
    }
}
