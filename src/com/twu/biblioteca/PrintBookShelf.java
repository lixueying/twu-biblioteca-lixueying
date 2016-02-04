package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class PrintBookShelf {

    String str = "";
    ConsolePrinter consolePrinter = new ConsolePrinter();


    public String printBookShelf(ArrayList<Book> books){

        consolePrinter.println("List Books:");
        System.out.println();
        for(Book book: books){
            consolePrinter.println(book.getName());
        }

        System.out.println();
        consolePrinter.print("Input the book name to look the Book Details: ");
        str = consolePrinter.input();
        return str;
    }

    public boolean isInBookShelf(String str){
        for(Book book: BibliotecaApp.books){
            if(book.getName().equals(str)){
                return true;
            }
        }
        return false;
    }

    public String bookDetails(String str){
        String msg = null;
        for(Book book: BibliotecaApp.books) {
            if (book.getName().equals(str)) {
                consolePrinter.println(book.getName() + "    " + book.getAuthor() + "    " + book.getYearPublished());
                consolePrinter.print("Do you want to check out this book?(y/n): ");
                msg = consolePrinter.input();
            }
        }
        return msg;
    }

    public String printHome(ArrayList<Book> books){
        String msg = "";
        String str = printBookShelf(books);
        if(isInBookShelf(str)){
            msg = bookDetails(str);
        }else{
            consolePrinter.println("Select a valid option!");
        }
        return msg;
    }

    public ArrayList<Book> updateBooks(Book book){
        BibliotecaApp.books.remove(book);
        return BibliotecaApp.books;
    }
}
