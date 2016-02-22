package com.twu.biblioteca;

import com.twu.biblioteca.Movie.Movie;
import com.twu.biblioteca.Movie.MovieRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/2/22.
 */
public class MovieRepositoryTest {
    private MovieRepository movieRepository;
    private ArrayList<Movie> movies;

    @Before
    public void setUp(){
        movieRepository = new MovieRepository();
        movies = new ArrayList<Movie>();
    }

    @Test
    public void should_return_movies_size_3(){
        movies = movieRepository.movieShelf();
        assertThat(movies.size(), is(3));
    }

    @Test
    public void return_list_first_movie_name_123(){
        movies = movieRepository.movieShelf();
        assertThat(movies.get(0).getName(), is("123"));
    }
}
