package com.solvd.bookexam.menu;
import com.solvd.bookexam.subjects.Subject;
import com.solvd.bookexam.teachers.*;
import com.solvd.bookexam.utils.JsonExec;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Exam {

    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Exam.class));

    public static void add() {

        Subject subject = new Subject();
        subject.setName("Subject");
        subject.getName();

        Subject subject1 = new Subject();
        subject1.setName("Mathematics");
        subject1.getName();

        Subject subject2 = new Subject();
        subject2.setName("Chemistry");
        subject2.getName();

        Subject subject3 = new Subject();
        subject3.setName("Physics");
        subject3.getName();

        Subject subject4 = new Subject();
        subject4.setName("English");
        subject4.getName();

        Subject subject5 = new Subject();
        subject5.setName("Psychology");
        subject5.getName();

        Subject subject6 = new Subject();
        subject6.setName("Philosophy");
        subject6.getName();

//		========================================
        Teacher teacher = new Teacher();
        teacher.setFullname("Teacher's Name");
        teacher.getFullname();
        teacher.setSubject(subject);
        teacher.getSubject();

        Teacher mathteacher = new MathTeacher();
        mathteacher.setFullname("Rehne Dekard");
        mathteacher.getFullname();
        mathteacher.setSubject(subject1);
        mathteacher.getSubject();


        Teacher chemteacher = new ChemistryTeacher();
        chemteacher.setFullname("Marie Curie");
        chemteacher.getFullname();
        chemteacher.setSubject(subject2);
        chemteacher.getSubject();

        Teacher physteacher = new PhysicsTeacher();
        physteacher.setFullname("Nikola Tesla");
        physteacher.getFullname();
        physteacher.setSubject(subject3);
        physteacher.getSubject();

        Teacher engteacher = new EnglishTeacher();
        engteacher.setFullname("J.K Rowling");
        engteacher.getFullname();
        engteacher.setSubject(subject4);
        engteacher.getSubject();

        Teacher psychteacher = new PsychologyTeacher();
        psychteacher.setFullname("Sigmund Freud");
        psychteacher.getFullname();
        psychteacher.setSubject(subject5);
        psychteacher.getSubject();

        Teacher philteacher = new PhilosophyTeacher();
        philteacher.setFullname("Friedrich Nietzsche");
        philteacher.getFullname();
        philteacher.setSubject(subject6);
        philteacher.getSubject();

        List<Teacher> stuff = new ArrayList<Teacher>();
        stuff.add(mathteacher);
        stuff.add(chemteacher);
        stuff.add(philteacher);
        stuff.add(physteacher);
        stuff.add(engteacher);
        stuff.add(psychteacher);

        LOGGER.info(teacher.getFullname());
        LOGGER.info("Name was printed");

        JsonExec jsonAction = new JsonExec();

        String jsonSrt = jsonAction.convertJavaToJsonStr(stuff);

        LOGGER.info(jsonSrt);
        LOGGER.info("================");
        jsonAction.convertJavaToJsonFile(stuff, "Department.json");

        jsonAction.convertJavaToJsonFile(chemteacher, "DepartmentMember.json");

    }

}

