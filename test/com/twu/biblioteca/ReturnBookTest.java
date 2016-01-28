package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBookTest {

    private ReturnBook returnBook;
    private Book book;

    @Before
    public void setUp(){
        returnBook = new ReturnBook();
        book = new Book("123", "123", "1234");
    }

    @Test
    public void should_return_a_book(){
        returnBook.returnBook(book);
    }
}
