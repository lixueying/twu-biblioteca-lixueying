package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Movie.Movie;

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
