package com.solvd.bookexam.menu;

import com.solvd.bookexam.subjects.Subject;
import com.solvd.bookexam.teachers.MathTeacher;
import com.solvd.bookexam.teachers.Teacher;
import com.solvd.bookexam.utils.JsonExec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(JsonExec.class));


    public void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Exam> exams = new ArrayList<>();
        try {
            System.out.println("Welcome to our site");
            boolean flag = true;
            while (flag) {
                System.out.println("Please tell me how can i help you");
                System.out.println("Press 1 - if you are a teacher.\n" +
                        "Press 2 - if you are a student.\nPress 3 - Leave the app.");
                System.out.print("Please make you choice: ");
                int selection = Integer.parseInt(reader.readLine());
                switch (selection) {
                    case 1:
                        System.out.println("Please enter your name");
                        Teacher teacher = new MathTeacher();
                        teacher.setFullName(reader.readLine());
                        System.out.println("Please choose your subject");
                        Subject subject = new Subject();
                        subject.setSubjectName(reader.readLine());
                        subject.setTeacher(teacher);
                        Exam exam = new Exam();
                        exam.setSubject(subject);
                        Map<String, Boolean> map = new HashMap<>();
                        System.out.println("Please choose exam date");
                        boolean flagForDate = true;
                        while (flagForDate) {
                            String date = reader.readLine();
                            if (date.equals("Q") || date.equals("q")) {
                                flagForDate = false;
                            } else {
                                map.put(date, false);
                                LOGGER.info("Press q(Q) if you have set exam date");
                            }
                        }
                        exam.setBookExam(map);
                        exams.add(exam);
                        break;
                    case 2:
                        System.out.println("Hello dear student");
                        System.out.println("Please enter exam name:");
                        String examName = reader.readLine();
                        Exam chosenExam = null;
                        for (Exam currentExam : exams) {
                            if (examName.equals(currentExam.getSubject().getSubjectName())) {
                                chosenExam = currentExam;
                                break;
                            }
                        }
                        if (chosenExam == null) {
                            System.out.println("This date is not available:");
                            break;
                        }
                        System.out.println("Enter exam date:");
                        String examDate = reader.readLine();
                        if (chosenExam.getBookExam().containsKey(examDate)) {
                            boolean ifExamAvailable = chosenExam.getBookExam().get(examDate);
                            if (ifExamAvailable) {
                                chosenExam.getBookExam().put(examDate, false);
                                break;
                            }
                            LOGGER.info("You have set exam date :" +" " +examDate);
                            JsonExec js = new JsonExec();
//                            String jsonSrt = jsonAction.convertJavaToJsonStr(examDate);
                            String jsonStr = js.convertJavaToJsonStr(chosenExam);
                            LOGGER.info(jsonStr);
                            js.convertJavaToJsonFile(chosenExam, "SubjectList.json");

                        }
                        break;
                    case 3:
                        flag = false;
                        System.out.println("Goodbye");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}