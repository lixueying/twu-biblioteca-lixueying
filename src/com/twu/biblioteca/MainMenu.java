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
    public void excute(){
        String msg = printBookshelf.printHome();

        while(msg.equals("n") || msg.equals("N") || msg.equals("")){
            System.out.print("Do you want to quit(y/n): ");
            Scanner scanner = new Scanner(System.in);
            strQuit = scanner.next();
            if(strQuit.equals("Y")){
                //QUIT
                System.out.println("QUIT");
                break;
            }else{
                msg = printBookshelf.printHome();
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
        for(Book book: printBookshelf.books){
            if(book.getName().equals(str)){
                booksMenu.add(book);
                printBookshelf.books.remove(book);
                System.out.println("Thank you! Enjoy the book");
                System.out.print("continue or quit?(c/q):");
                Scanner scanner = new Scanner(System.in);
                strQuit = scanner.next();
                for(Book book1:printBookshelf.books){
                    System.out.println(book1.getName());
                }
                if(strQuit.equals("q")){
                    //QUIT
                    System.out.println("QUIT");
                    break;
                }else{
                    printBookshelf.books.remove(book);
                    excute();
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
