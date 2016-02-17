package com.twu.biblioteca;

import com.twu.biblioteca.Book.PrintBookShelf;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by lixueying on 16/1/29.
 */
public class PrintBookShelfTest {

    private PrintBookShelf printBookShelf;
    private PrintBookShelf mockPrintBookShelf;
    private Console console;

    @Before
    public void setUp(){
        console = mock(Console.class);
        mockPrintBookShelf = new PrintBookShelf(console);
        printBookShelf = new PrintBookShelf();
    }

    @Test
    public void should_return_false_when_given_abc(){
        boolean flag = printBookShelf.isInBookShelf("abc");
        assertThat(flag, is(false));
    }

    @Test
    public void should_print_List_Books(){
        mockPrintBookShelf.printBookShelf(BibliotecaApp.books);
        verify(console).println("List Books:");
        verify(console).println("");
    }

//    @Test
//    public void should_print_book_detail(){
//        mockPrintBookShelf.bookDetails("Refactoring");
//        verify(console).println("Refactoring" + "    " + "Martin Fowler" + "    " + "1999-7-8");
//    }
}
