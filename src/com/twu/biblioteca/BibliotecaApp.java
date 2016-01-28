package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {

        PrintBookShelf printBookShelf = new PrintBookShelf();
        MainMenu mainMenu = new MainMenu();
        System.out.println("Welcome to library!");

        mainMenu.excute();

        printBookShelf.books.removeAll(mainMenu.booksMenu);


    }





}
