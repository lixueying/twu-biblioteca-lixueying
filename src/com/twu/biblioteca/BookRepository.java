package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/1/29.
 */
public class BookRepository {

    ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> bookShelf(){
        books.add(new Book("Refactoring", "Martin Fowler", "1999-7-8"));
        books.add(new Book("Clean Code", "Robert C. Martin", "2012-2-1"));
        books.add(new Book("The Art of UNIX Programming", "Eric S. Raymond", "2003-9-17"));
        return books;
    }



}
