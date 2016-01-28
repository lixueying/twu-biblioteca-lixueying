package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class PrintBookShelf {

    ArrayList<Book> books = new ArrayList<Book>();
    String str = null;

    public String printBookShelf(){
        BookRepository bookRepository = new BookRepository();

        books = bookRepository.bookShelf();
        System.out.println("List Books:");
        System.out.println();
        for(Book book: books){
            System.out.println(book.getName());
        }

        System.out.println();
        System.out.print("Input the book name to look the Book Details: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        return str;
    }

    public boolean isInBookShelf(String str){
        for(Book book: books){
            if(book.getName().equals(str)){
                return true;
            }
        }
        return false;
    }

    public String bookDetails(String str){
        String msg = null;
        for(Book book: books) {
            if (book.getName().equals(str)) {
                System.out.println(book.getName() + "    " + book.getAuthor() + "    " + book.getYearPublished());
                System.out.print("Do you want to check out this book?(y/n): ");
                Scanner scanner = new Scanner(System.in);
                msg = scanner.next();
            }
        }
        return msg;
    }

    public String printHome(){
        String msg = "";
        String str = printBookShelf();
        if(isInBookShelf(str)){
            msg = bookDetails(str);
        }else{
            System.out.println("Select a valid option!");
        }
        return msg;
    }
}
