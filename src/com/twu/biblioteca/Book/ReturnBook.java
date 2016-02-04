package com.twu.biblioteca.Book;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Book.Book;
import com.twu.biblioteca.Book.BookRepository;
import com.twu.biblioteca.ConsolePrinter;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBook {

    ConsolePrinter consolePrinter = new ConsolePrinter();
    BookRepository bookRepository = new BookRepository();

    public void input(){
        consolePrinter.print("which book: ");
        String name = consolePrinter.input();

        consolePrinter.print("which author: ");
        String author = consolePrinter.input();

        consolePrinter.print("yearPublished: ");
        String yearPublished = consolePrinter.input();

        Book book = new Book(name,author,yearPublished);

        returnBook(book);
    }

    public void returnBook(Book book){
        for(Book book1: BibliotecaApp.books){
            if(book.getName().equals(book1.getName())){
                consolePrinter.println("That is not a valid book to return.");
                break;
            }else {
                bookRepository.books.add(book);
                consolePrinter.println("Thank you for returning the book.");
            }
        }
    }

}
