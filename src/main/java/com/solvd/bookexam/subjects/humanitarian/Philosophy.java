package com.solvd.bookexam.subjects.humanitarian;

import com.solvd.bookexam.subjects.Subject;

public class Philosophy  extends Subject {

    private String name;

    public Philosophy(){
    }
    public Philosophy(String name){
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
        return "Philosophy{" +
                ", name='" + name + '\'' +
                '}';
    }
}
