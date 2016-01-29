package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/1/29.
 */
public class PrintBookShelfTest {
    private PrintBookShelf printBookShelf;

    @Before
    public void setUp(){
        printBookShelf = new PrintBookShelf();
    }

    @Test
    public void should_return_false_when_given_abc(){
        boolean flag = printBookShelf.isInBookShelf("abc");
        assertThat(flag, is(false));
    }

    @Test
    public void should_reduce_a_book(){
        Book book = new Book("Refactoring","Martin Fowler", "1999-7-8");
        printBookShelf.updateBooks(book);
    }
}
