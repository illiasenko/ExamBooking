package com.solvd.bookexam.subjects.applied;

import com.solvd.bookexam.subjects.Subject;

public class Mathematics extends Subject {

    private String name;

    public Mathematics(){
    }
    public Mathematics(String name){
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
        return "Mathematics{" +
                ", name='" + name + '\'' +
                '}';
    }
}
