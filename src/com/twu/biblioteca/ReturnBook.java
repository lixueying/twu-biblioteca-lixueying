package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class ReturnBook {


    BookRepository bookRepository = new BookRepository();
    public void returnBook(){
        System.out.println("which book: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("which author: ");
        Scanner scanner1 = new Scanner(System.in);
        String author = scanner1.nextLine();
        System.out.println("yearPublished: ");
        Scanner scanner2 = new Scanner(System.in);
        String yearPublished = scanner2.nextLine();

        bookRepository.books.add(new Book(name,author,yearPublished));
        System.out.println("Thank you for returning the book.");
    }
}
