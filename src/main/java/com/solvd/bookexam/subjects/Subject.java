package com.solvd.bookexam.subjects;


import com.solvd.bookexam.teachers.Teacher;

public class Subject implements Point {

    private String subjectName;
    private Teacher teacher;


    public Subject(){

    }

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public void pass() {

    }
}
