package com.solvd.bookexam.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingToProp {

    public String getValueFromProperties(String path, String key) {

        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            properties.load(fis);
            fis.close();
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "stay at home";
    }

    public void setValueToProperties(String path, String key, String value) {

        Properties properties = new Properties();
        try {
            FileOutputStream fos = new FileOutputStream(path);
            properties.setProperty(key, value);
            properties.store(fos, "");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}