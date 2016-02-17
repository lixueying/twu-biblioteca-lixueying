package com.twu.biblioteca.Movie;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Console;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/2.
 */
public class MoviesMenu {
    private CheckoutMovie checkoutMovie = new CheckoutMovie();
    private Console console = new Console();
    public void excute(ArrayList<Movie> movies){
        System.out.println("List Movies:");
        System.out.println();
        for(Movie movie: movies){
            console.println(movie.getName());
        }

        console.print("choose movie to check out: ");
        String str = console.input();
        if(checkoutMovie.isInMovieShelf(str)){
            String strQuit = checkoutMovie.putInMovieMenu(str);
            isQuit(strQuit);
        }else {
            console.println("no this movie");
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
