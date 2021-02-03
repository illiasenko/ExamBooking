package com.solvd.bookexam.utils;
import com.solvd.bookexam.additional.MyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValue {
    public static int inputValue() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e)  {
            throw new MyException(e.getMessage());
        }
    }
}