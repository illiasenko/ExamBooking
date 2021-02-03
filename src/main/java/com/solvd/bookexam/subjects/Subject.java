package com.solvd.bookexam.subjects;

public class Subject implements Point {

    private String name;

    public Subject(){
    }
    public Subject(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void evaluate() {

    }
}
