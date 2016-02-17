package com.twu.biblioteca.User;

/**
 * Created by lixueying on 16/2/6.
 */
public class User {
    private String number;
    private String psw;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(){

    }

    public User(String number, String name, String email, String address, String phoneNumber){
        this.number = number;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(String number, String psw){
        this.number = number;
        this.psw = psw;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDetailsAsString() {
        return String.format("%-30.30s | %-30.30s | %-30.30s | %-30.30s", name, email, address, phoneNumber);
    }
}

