package com.twu.biblioteca.User;

import com.twu.biblioteca.Console;

/**
 * Created by lixueying on 16/2/6.
 */
public class Login {
    Console console = new Console();
    UserRepository userRepository = new UserRepository();

    private String num;
    private String psw;
    private boolean flag = false;
    public void login(){
        User user = inputLogin();
        flag = IsUser(user);
        while (flag == false){
            console.println("wrong!");
            flag = IsUser(inputLogin());
        }
        showUserMsg(user);
    }

    public boolean IsUser(User user){
        for(User user1:userRepository.usersId()){
            if(user1.getNumber().equals(user.getNumber()) && user1.getPsw().equals(user.getPsw())) {
                return true;
            }
        }
        return false;
    }

    public User inputLogin(){
        console.println("please login the library");
        console.print("input your library number: ");
        num = console.input();
        console.print("input your password: ");
        psw = console.input();
        User user = new User(num, psw);
        return user;
    }

    public void showUserMsg(User user){
        console.println("show your message");
        userRepository.usersInformation = userRepository.usersInformation();
        for(User user1: userRepository.usersInformation){
            if(user1.getNumber().equals(user.getNumber())){
                console.println(user1.getName() + " | " +user1.getEmail() + " | " + user1.getAddress() + " | " +user1.getPhoneNumber());
            }
        }
    }
}
