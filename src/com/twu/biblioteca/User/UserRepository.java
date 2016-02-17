package com.twu.biblioteca.User;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/2/6.
 */
public class UserRepository {
    ArrayList<User> usersInformation = new ArrayList<User>();
    ArrayList<User> usersId = new ArrayList<User>();
    public ArrayList<User> usersInformation(){
        usersInformation.add(new User("000-0001", "shawn", "423648182@qq.com", "TW", "123456789"));
        return usersInformation;
    }

    public ArrayList<User> usersId(){
        usersId.add(new User("000-0001", "001"));
        return usersId;
    }
}
