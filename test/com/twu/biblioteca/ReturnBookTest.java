package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Book.ReturnBook;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.Console;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBookTest {

    private ReturnBook returnBook;
    private Book book;
    private ConsolePrinter consolePrinter;
    private InOrder inOrder;

    @Before
    public void setUp(){


        returnBook = new ReturnBook();
        book = new Book("123", "123", "1234");
    }

    @Test
    public void should_return_a_book(){
        returnBook.returnBook(book);
        //inOrder.verify(consolePrinter, times(1)).print("Thank you for returning the book.");

    }
}
