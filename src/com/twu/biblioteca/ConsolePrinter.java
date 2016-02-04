package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by lixueying on 16/1/29.
 */
public class ConsolePrinter {

    public void print(String content) {
        System.out.print(content);
    }
    public void println(String content) {
        System.out.println(content);
    }

    public String input(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

}
