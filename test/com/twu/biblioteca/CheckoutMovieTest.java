package com.twu.biblioteca;

import com.twu.biblioteca.Movie.CheckoutMovie;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/2/22.
 */
public class CheckoutMovieTest {
    private CheckoutMovie checkoutMovie;

    @Before
    public void setUp(){
        checkoutMovie = new CheckoutMovie();
    }

    @Test
    public void should_return_the_1234_is_in_movie_shelf_the_false(){
        boolean flg = checkoutMovie.isInMovieShelf("1234");
        assertThat(flg, is(false));
    }
}
