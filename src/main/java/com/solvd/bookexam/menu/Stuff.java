package com.solvd.bookexam.menu;

import com.solvd.bookexam.teachers.Teacher;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Stuff {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Stuff.class));

    ArrayList<Teacher> stuff = new ArrayList<>();

    public void addTeacher(Teacher teacher){
        stuff.add(teacher);
    }
    public ArrayList<Teacher> getAllStuff(){
        return stuff;
    }
    public void printEveryTeacher() {
        LOGGER.info("Print everyone from Teacher's Stuff");
        for (Teacher teacher : stuff) {
            teacher.talk();
        }
    }
}