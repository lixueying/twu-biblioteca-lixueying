package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static ArrayList<Book> books = new ArrayList<Book>();
    ConsolePrinter consolePrinter = new ConsolePrinter();

    public BibliotecaApp(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public static void main(String arg[]) {

        ConsolePrinter consolePrinter = new ConsolePrinter();
        ReturnBook returnBook = new ReturnBook();
        MainMenu mainMenu = new MainMenu();

        consolePrinter.print("Welcome to library!");

        books = tool();

        System.out.print("return book?(y/n): ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equals("y")){
            returnBook.input();
        }else {
            mainMenu.excute(books);
        }

    }

    public static ArrayList<Book> tool(){

        BookRepository bookRepository = new BookRepository();
        books = bookRepository.bookShelf();
        return books;
    }





}
