package com.twu.biblioteca.Book;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Console;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/1/29.
 */
public class PrintBookShelf {

    String str = "";
    Console console = new Console();

    public PrintBookShelf(){}
    public PrintBookShelf(Console console) {
        this.console = console;
    }


    public void printBookShelf(ArrayList<Book> books){

        console.println("List Books:");
        console.println("");
        for(Book book: books){
            console.println(book.getName());
        }
    }

    public boolean isInBookShelf(String str){

        for(Book book: BibliotecaApp.books){
            if(book.getName().equals(str)){
                return true;
            }
        }
        return false;
    }

    public void bookDetails(String str){
        for(Book book: BibliotecaApp.books) {
            if (book.getName().equals(str)) {
                console.println(book.getName() + "    " + book.getAuthor() + "    " + book.getYearPublished());
            }
        }
    }

    public String printHome(ArrayList<Book> books){
        String msg = "";
        printBookShelf(books);
        console.println("");
        console.print("Input the book name to look the Book Details: ");
        str = console.input();
        if(isInBookShelf(str)){
            bookDetails(str);
            console.print("Do you want to check out this book?(y/n): ");
            msg = console.input();
        }else{
            console.println("Select a valid option!");
        }
        return msg;
    }

    public ArrayList<Book> updateBooks(Book book){
        BibliotecaApp.books.remove(book);
        return BibliotecaApp.books;
    }
}
