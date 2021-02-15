package com.solvd.bookexam.menu;

import com.solvd.bookexam.subjects.Subject;
import java.util.HashMap;
import java.util.Map;

public class Exam {
    private Subject subject;

    Map<String, Boolean> bookExam = new HashMap<>();

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setBookExam(Map<String, Boolean> bookExam) {
        this.bookExam = bookExam;
    }

    public Map<String, Boolean> getBookExam() {
        return bookExam;
    }
}