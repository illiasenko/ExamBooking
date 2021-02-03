package com.solvd.bookexam.utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.io.IOException;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.bookexam.teachers.Teacher;


public class JsonExec {

    private final static Logger LOGGER = Logger.getLogger(String.valueOf(JsonExec.class));

    public String convertJavaToJsonStr(Object obj) {

        String jsonStr = "";

        try {
            jsonStr = new ObjectMapper().writeValueAsString(obj);
            LOGGER.info("convert to string, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    public void convertJavaToJsonFile(Object obj, String pathToFile) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("write to file, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Teacher convertJsonStrToTeacherPOJO(String jsonStr) {
        Teacher teacher = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            teacher = mapper.readValue(jsonStr, Teacher.class);
            LOGGER.info("convert to POJO, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return teacher;
    }
}