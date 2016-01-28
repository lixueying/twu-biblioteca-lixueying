package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBook {


    BookRepository bookRepository = new BookRepository();
    public void input(){
        System.out.print("which book: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("which author: ");
        Scanner scanner1 = new Scanner(System.in);
        String author = scanner1.nextLine();
        System.out.print("yearPublished: ");
        Scanner scanner2 = new Scanner(System.in);
        String yearPublished = scanner2.nextLine();
        Book book = new Book(name,author,yearPublished);
    }
    public void returnBook(Book book){
        bookRepository.books.add(book);
        System.out.println("Thank you for returning the book.");
    }
}
