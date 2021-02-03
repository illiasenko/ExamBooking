package com.solvd.bookexam.subjects.applied;

import com.solvd.bookexam.subjects.Subject;

public class Physics extends Subject {

    private String name;

    public Physics(){
    }
    public Physics(String name){

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
        return "Physics{" +
                ", name='" + name + '\'' +
                '}';
    }
}
