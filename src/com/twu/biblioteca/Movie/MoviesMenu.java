package com.twu.biblioteca.Movie;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.ConsolePrinter;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/2.
 */
public class MoviesMenu {
    private CheckoutMovie checkoutMovie = new CheckoutMovie();
    private ConsolePrinter consolePrinter = new ConsolePrinter();
    public void excute(ArrayList<Movie> movies){
        System.out.println("List Movies:");
        System.out.println();
        for(Movie movie: movies){
            consolePrinter.println(movie.getName());
        }

        consolePrinter.print("choose movie to check out: ");
        String str = consolePrinter.input();
        if(checkoutMovie.isInMovieShelf(str)){
            String strQuit = checkoutMovie.putInMovieMenu(str);
            isQuit(strQuit);
        }else {
            consolePrinter.println("no this movie");
        }
    }

    public void isQuit(String strQuit){
        if(strQuit.equals("q")){
            //QUIT
            System.out.println("QUIT");
        }else{
            excute(BibliotecaApp.movies);
        }
    }


}
