package com.twu.biblioteca;

/**
 * Created by lixueying on 16/1/29.
 */
public class Book {
    private String name;
    private String author;
    private String yearPublished;
    private String isbn;

    public Book(String isbn, String name, String author, String yearPublished){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
