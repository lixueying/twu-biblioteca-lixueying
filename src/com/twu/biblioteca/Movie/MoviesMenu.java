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
        console.println("List Movies:");
        console.println("");
        for(Movie movie: movies){
            console.println(movie.getName());
        }

        chooseMovie();
    }

    public void chooseMovie(){
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
            console.println("QUIT");
        }else{
            excute(BibliotecaApp.movies);
        }
    }

}
