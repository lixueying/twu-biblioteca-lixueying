package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class BookMenu {

    ArrayList<Book> booksMenu = new ArrayList<Book>();
    PrintBookShelf printBookshelf = new PrintBookShelf();
    ConsolePrinter consolePrinter = new ConsolePrinter();

    private String strQuit;
    private String msg;

    public void excute(ArrayList<Book> books){
        msg = printBookshelf.printHome(books);

        while(msg.equals("n") || msg.equals("N") || msg.equals("")){
            consolePrinter.print("Do you want to quit(y/n): ");
            strQuit = consolePrinter.input();
            if(strQuit.equals("y")){
                //QUIT
                System.out.println("QUIT");
                break;
            }else{
                msg = printBookshelf.printHome(books);
            }
        }
        isCheckOut();

    }

    public void isCheckOut(){
        if(msg.equals("y") || msg.equals("Y")){
            //放进购物车
            putInMenu(printBookshelf.str);
        }else if (!msg.equals("y") && !msg.equals("n")){
            consolePrinter.println("please input right word!");
        }
    }

    public void putInMenu(String str) {

        for(Book book: BibliotecaApp.books){
            if(book.getName().equals(str)){
                booksMenu.add(book);
                BibliotecaApp.books = printBookshelf.updateBooks(book);

                consolePrinter.println("Thank you! Enjoy the book");
                consolePrinter.print("continue or quit?(c/q):");
                strQuit = consolePrinter.input();

                if(strQuit.equals("q")){
                    //QUIT
                    System.out.println("QUIT");
                    break;
                }else{
                    excute(BibliotecaApp.books);
                }
            }
        }
    }

}
