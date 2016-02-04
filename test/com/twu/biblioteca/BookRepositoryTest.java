package com.twu.biblioteca;

import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Book.BookRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/1/29.
 */
public class BookRepositoryTest {
    private BookRepository bookRepository;
    private ArrayList<Book> books;

    @Before
    public void setUp(){
        bookRepository = new BookRepository();
        books = new ArrayList<Book>();
    }
    @Test
    public void return_list_size_3(){
        books = bookRepository.bookShelf();
        assertThat(books.size(), is(3));
    }

    @Test
    public void return_list_first_book_name_Refactoring(){
        books = bookRepository.bookShelf();
        assertThat(books.get(0).getName(), is("Refactoring"));
    }
}
