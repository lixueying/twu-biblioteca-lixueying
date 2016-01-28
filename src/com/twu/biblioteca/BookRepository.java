package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/1/29.
 */
public class BookRepository {

    ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> bookShelf(){
        books.add(new Book("9780201485677", "Refactoring", "Martin Fowler", "1999-7-8"));
        books.add(new Book("9780132350884", "Clean Code", "Robert C. Martin", "2012-2-1"));
        books.add(new Book("9780131429017", "The Art of UNIX Programming", "Eric S. Raymond", "2003-9-17"));
        return books;
    }

}
