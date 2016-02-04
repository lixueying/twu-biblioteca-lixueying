package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/2.
 */
public class MovieRepository {

    ArrayList<Movie> movies = new ArrayList<Movie>();

    public ArrayList<Movie> movieShelf(){
        movies.add(new Movie("123","1234","12345","123456"));
        movies.add(new Movie("ABC","AFR","AEFRWF","EFAF"));
        movies.add(new Movie("DEG","FRG","FRSG","GTE"));

        return movies;
    }
}
