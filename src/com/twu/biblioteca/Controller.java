package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private Library library;

    public Controller(Library library) {
        this.library = library;
    }

    public void displayBibliotecaMenu(){

        List<String> options = new ArrayList();
        options.add("<Biblioteca Menu Options>");
        options.add("<1> List of Books");
        options.add("<2> Quit Program");

        for (String optionNum : options) { System.out.println(optionNum);}

    }
    public void chooseOption() {
        String chooseOption = "Type the option from the menu (e.g. 1 for Option 1): ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(chooseOption);

        String option = scanUser.nextLine();
        if (option.matches("[1-2]")) {
            int optionUser = Integer.parseInt(option);
            if (optionUser == 1) {
//            Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
//            Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
//
//            book1.displayTitleAuthorYear();
//            book2.displayTitleAuthorYear();
                library.displayBookList();
            }
            else if (optionUser == 2) {
                this.exitProgram();
            }


        } else {
            String invalidOption = "Please select a valid option!";

            System.out.println(invalidOption);
            chooseOption();
        }

    }
    public void exitProgram(){

        System.exit(0);

    }
    public void userCheckOutBook(){

    }


}
