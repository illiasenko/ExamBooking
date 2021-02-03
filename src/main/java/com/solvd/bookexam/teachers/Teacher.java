package com.solvd.bookexam.teachers;
import com.solvd.bookexam.subjects.Subject;

public class Teacher implements Speak{

    private String fullname;
    private Subject subject;

    public Teacher(){
    }
    public Teacher(String fullname){
        this.fullname = fullname;
    }
    public Teacher(String fullname, Subject subject){
        this.fullname = fullname;
        this.subject = subject;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getFullname() {
        return fullname;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullname='" + fullname + '\'' +
                ", subject=" + subject +
                '}';
    }
    @Override
    public void talk() {
    }

}
