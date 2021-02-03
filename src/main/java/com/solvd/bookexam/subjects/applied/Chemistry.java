package com.solvd.bookexam.subjects.applied;

import com.solvd.bookexam.subjects.Subject;

public class Chemistry extends Subject {

    private String name;

    public Chemistry(){
    }
    public Chemistry(String name){
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
        return "Chemistry{" +
                "name='" + name + '\'' +
                '}';
    }
}
