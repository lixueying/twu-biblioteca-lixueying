package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Book.BookMenu;
import com.twu.biblioteca.Book.BookRepository;
import com.twu.biblioteca.Book.ReturnBook;
import com.twu.biblioteca.Movie.Movie;
import com.twu.biblioteca.Movie.MovieRepository;
import com.twu.biblioteca.Movie.MoviesMenu;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/3.
 */
public class MainMenu {

    ConsolePrinter consolePrinter = new ConsolePrinter();
    ReturnBook returnBook = new ReturnBook();
    BookMenu bookMenu = new BookMenu();
    MoviesMenu moviesMenu = new MoviesMenu();

    public void showMainMenu(){

        consolePrinter.print("1.book or 2.movie?(1/2): ");

        if(consolePrinter.input().equals("1")){
            BibliotecaApp.books = bookTool();
            consolePrinter.print("return book?(y/n): ");
            judge();
        }else{
            BibliotecaApp.movies = movieTool();
            moviesMenu.excute(BibliotecaApp.movies);
        }
    }

    public void judge(){

        if(consolePrinter.input().equals("y")){
            returnBook.input();
        }else {
            bookMenu.excute(BibliotecaApp.books);
        }
    }

    public ArrayList<Book> bookTool(){

        BookRepository bookRepository = new BookRepository();
        BibliotecaApp.books = bookRepository.bookShelf();
        return BibliotecaApp.books;
    }

    public ArrayList<Movie> movieTool(){
        MovieRepository movieRepository = new MovieRepository();
        BibliotecaApp.movies = movieRepository.movieShelf();
        return BibliotecaApp.movies;
    }
}
