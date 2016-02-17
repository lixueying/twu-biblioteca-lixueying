package com.twu.biblioteca.Movie;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Console;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/3.
 */
public class CheckoutMovie {
    private ArrayList<Movie> movieMenu = new ArrayList<Movie>();
    private Console console = new Console();

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
                console.println("Thank you! Enjoy the movie");
                break;
            }
        }
        console.print("continue or quit?(c/q):");
        String strQuit = console.input();
        return strQuit;
    }

    public ArrayList<Movie> updateMovies(Movie movie){
        BibliotecaApp.movies.remove(movie);
        return BibliotecaApp.movies;
    }




}
