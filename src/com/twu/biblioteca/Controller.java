package com.twu.biblioteca;

import java.util.Scanner;

public class Controller {

    public void displayBibliotecaMenu(){
        String menu = "<Biblioteca Menu Options>";
        String option1 = "<1> List of Books";
        String optionOut = "<2> Quit Program";

        System.out.println(menu);
        System.out.println(option1);
        System.out.println(optionOut);

    }
    public void chooseOption() {
        String chooseOption = "Type the option from the menu (e.g. 1 for Option 1): ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(chooseOption);

        int optionUser = scanUser.nextInt();
//        int optionUser = 2; //Use only to test

        if (optionUser == 1) {
            Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
            Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);

            book1.displayTitleAuthorYear();
            book2.displayTitleAuthorYear();
        }
        else if (optionUser == 2) {
            this.exitProgram();
        }
        else {
            String invalidOption = "Please select a valid option!";

            System.out.println(invalidOption);
            this.chooseOption();
        }

    }
    public void exitProgram(){
        Scanner scanUser = new Scanner(System.in);
        int inputUser = scanUser.nextInt();
//        int inputUser = 0;
        if (inputUser == 2){

            System.exit(0);

        }else {
            this.displayBibliotecaMenu();
            this.chooseOption();
        }

    }


}
