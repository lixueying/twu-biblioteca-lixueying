package com.twu.biblioteca.Book;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.Console;
import com.twu.biblioteca.User.Login;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/1/29.
 */
public class BookMenu {

    ArrayList<Book> booksMenu = new ArrayList<Book>();
    PrintBookShelf printBookshelf = new PrintBookShelf();
    Login login = new Login();
    Console console = new Console();

    private String strQuit;
    private String msg;

    public void excute(ArrayList<Book> books){
        msg = printBookshelf.printHome(books);

        while(msg.equals("n") || msg.equals("N") || msg.equals("")){
            console.print("Do you want to quit(y/n): ");
            strQuit = console.input();
            if(strQuit.equals("y")){
                //QUIT
                System.out.println("QUIT");
                break;
            }else{
                msg = printBookshelf.printHome(books);
            }
        }
        login.login();
        isCheckOut();

    }

    public void isCheckOut(){
        if(msg.equals("y") || msg.equals("Y")){
            //放进购物车
            putInMenu(printBookshelf.str);
        }else if (!msg.equals("y") && !msg.equals("n")){
            console.println("please input right word!");
        }
    }

    public void putInMenu(String str) {

        for(Book book: BibliotecaApp.books){
            if(book.getName().equals(str)){
                booksMenu.add(book);
                BibliotecaApp.books = printBookshelf.updateBooks(book);

                console.println("Thank you! Enjoy the book");
                console.print("continue or quit?(c/q):");
                strQuit = console.input();

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
