package com.solvd.bookexam.utils;


import com.solvd.bookexam.teachers.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WritingToFile {
    static String separator = File.separator;
    static String pathFirst = "C:" + separator + "Users" + separator + "ilyxa" + separator + "IdeaProjects"
            + separator + "Exam" + separator + "src" + separator + "List.txt";


    public void writeToFile(List<Teacher> stuff) {

        File file = new File(pathFirst);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println(stuff);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
