package com.twu.biblioteca.Book;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Console;
import com.twu.biblioteca.User.Login;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBook {

    Console console = new Console();
    BookRepository bookRepository = new BookRepository();
    Login login = new Login();
    public ReturnBook(){}
    public ReturnBook(Console console) {
        this.console = console;
    }

    public void input(){
        login.login();
        console.print("which book: ");
        String name = console.input();

        console.print("which author: ");
        String author = console.input();

        console.print("yearPublished: ");
        String yearPublished = console.input();

        Book book = new Book(name,author,yearPublished);

        returnBook(book);
    }

    public void returnBook(Book book){
        for(Book book1: BibliotecaApp.books){
            if(book.getName().equals(book1.getName())){
                console.println("That is not a valid book to return.");
                break;
            }else {
                bookRepository.books.add(book);
                console.println("Thank you for returning the book.");
                break;
            }
        }
    }

}
