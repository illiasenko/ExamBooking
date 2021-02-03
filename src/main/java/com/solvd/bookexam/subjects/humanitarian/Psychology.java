package com.solvd.bookexam.subjects.humanitarian;

import com.solvd.bookexam.subjects.Subject;

public class Psychology extends Subject {

    private String name;

    public Psychology(){
    }
    public Psychology(String name){
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
        return "Psychology{" +
                ", name='" + name + '\'' +
                '}';
    }
}
