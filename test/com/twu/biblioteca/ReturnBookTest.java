package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Book.ReturnBook;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBookTest {

    private ReturnBook mockReturnBook;
    private Book book;
    private Console console;

    @Before
    public void setUp(){

        console = mock(Console.class);
        mockReturnBook = new ReturnBook(console);
        book = new Book("123", "123", "1234");
    }

//    @Test
//    public void should_return_a_book(){
//        mockReturnBook.returnBook(book);
//        verify(console).println("Thank you for returning the book.");
//    }

}
