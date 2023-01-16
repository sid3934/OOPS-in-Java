/*
Java has 2 types of packages: built-in & user defined packages.
Java has 4 access modifiers: Public, Private, Protected & Default
 */
package com.siddharth;

class BankAccount{
    public String name; //public variables are available to every package, every class
    String phone_number; //this is default variable, accessible to all classes inside a package but inaccessible outside its package (in accessible outside com.siddharth)
    protected String email; //protected variables are accessible to all classes of its package but outside its package it's accessible to subclasseses only
    private String password; // inaccessible to everything outside BankAccount class

    //to access and modify private variables we use Getters and Setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
//this was encapsulation where we encapsulated various data variables and properties in BankAccount class


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.name = "Siddharth";
        acc1.email = "abc@gmail.com";
     //   acc1.password; //this returns an error because password is private to the BankAccount class.
        System.out.println(acc1.getPassword());
    }
}
