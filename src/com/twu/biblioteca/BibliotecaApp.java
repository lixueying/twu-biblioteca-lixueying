package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Movie.Movie;

import java.util.ArrayList;

public class BibliotecaApp {

    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<Movie> movies = new ArrayList<Movie>();

    Console console = new Console();

    public BibliotecaApp(Console console) {
        this.console = console;
    }

    public static void main(String arg[]) {

        MainMenu mainMenu = new MainMenu();
        Console console = new Console();

        console.print("Welcome to library!");

        mainMenu.showMainMenu();

    }

}
