package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/3.
 */
public class CheckoutMovie {
    private ArrayList<Movie> movieMenu = new ArrayList<Movie>();
    private ConsolePrinter consolePrinter = new ConsolePrinter();

    public boolean isInMovieShelf(String str){
        for(Movie movie: BibliotecaApp.movies){
            if(movie.getName().equals(str)){
                return true;
            }
        }
        return false;
    }

    public String putInMovieMenu(String str){
        for(Movie movie: BibliotecaApp.movies){
            if(movie.getName().equals(str)){
                movieMenu.add(movie);
                BibliotecaApp.movies = updateMovies(movie);
                consolePrinter.println("Thank you! Enjoy the movie");
                break;
            }
        }
        consolePrinter.print("continue or quit?(c/q):");
        String strQuit = consolePrinter.input();
        return strQuit;
    }

    public ArrayList<Movie> updateMovies(Movie movie){
        BibliotecaApp.movies.remove(movie);
        return BibliotecaApp.movies;
    }




}
