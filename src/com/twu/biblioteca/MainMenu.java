package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class MainMenu {

    ArrayList<Book> booksMenu = new ArrayList<Book>();
    PrintBookShelf printBookshelf = new PrintBookShelf();

    private String strQuit;

    public void excute(ArrayList<Book> books){
        String msg = printBookshelf.printHome(books);

        while(msg.equals("n") || msg.equals("N") || msg.equals("")){
            System.out.print("Do you want to quit(y/n): ");
            Scanner scanner = new Scanner(System.in);
            strQuit = scanner.next();
            if(strQuit.equals("y")){
                //QUIT
                System.out.println("QUIT");
                break;
            }else{
                msg = printBookshelf.printHome(books);
            }
        }
        if(msg.equals("y") || msg.equals("Y")){
            //放进购物车
            putInMenu(printBookshelf.str);
        }else if (!msg.equals("y") && !msg.equals("n")){
            System.out.println("please input right word!");
        }

    }

    private void putInMenu(String str) {

        for(Book book: BibliotecaApp.books){
            if(book.getName().equals(str)){
                booksMenu.add(book);
                BibliotecaApp.books = printBookshelf.updateBooks(book);

                System.out.println("Thank you! Enjoy the book");
                System.out.print("continue or quit?(c/q):");
                Scanner scanner = new Scanner(System.in);
                strQuit = scanner.next();

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

    private void showMainMenu(){
        for(Book book: booksMenu){
            System.out.println(book.getName());
        }
    }
}
