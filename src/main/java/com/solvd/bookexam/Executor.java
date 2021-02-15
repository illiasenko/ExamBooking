package com.solvd.bookexam;

import com.solvd.bookexam.menu.Menu;

import java.io.IOException;

public class Executor {
    public static void main (String [] args) throws IOException {
        Menu menu = new Menu();
        menu.start();
    }

}
