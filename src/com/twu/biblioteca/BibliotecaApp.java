package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        Controller control = new Controller();

        System.out.println(welcomeMessage);
        control.displayBibliotecaMenu();
        control.chooseOption();



    }
}
