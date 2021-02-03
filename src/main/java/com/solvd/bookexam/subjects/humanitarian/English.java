package com.solvd.bookexam.subjects.humanitarian;

import com.solvd.bookexam.subjects.Subject;

public class English extends Subject {

    private String name;

    public English(){
    }
    public English(String name, String teacher){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhysicalTraining{" +
                ", name='" + name + '\'' +
                '}';
    }
}
