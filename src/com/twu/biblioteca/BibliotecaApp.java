package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Movie> movies = new ArrayList<Movie>();

    ConsolePrinter consolePrinter = new ConsolePrinter();

    public BibliotecaApp(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public static void main(String arg[]) {

        MainMenu mainMenu = new MainMenu();
        ConsolePrinter consolePrinter = new ConsolePrinter();

        consolePrinter.print("Welcome to library!");

        mainMenu.showMainMenu();

    }

}
