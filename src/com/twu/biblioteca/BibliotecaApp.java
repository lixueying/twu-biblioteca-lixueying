package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {

        ReturnBook returnBook = new ReturnBook();
        MainMenu mainMenu = new MainMenu();
        System.out.println("Welcome to library!");

        System.out.print("return book?(y/n): ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equals("y")){
            returnBook.input();
        }else {
            mainMenu.excute();
        }

    }





}
