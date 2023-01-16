package com.siddharth;
/*
Interfaces are similar to classes with slight differences that make Abstraction pure
Interfaces can't have constructors, they have methods but the methods are not implemented in them.
Derived Classes implement Interface (not not extends)
Everything written inside an interface is abstract by default
While a derived class can extend only one base class, in Interface a derived class can implement multiple Interfaces
 */
interface Animals{
    public void walk();
}
interface Stray{
}
class Dog implements Animals, Stray{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Abstraction_using_Interface {
    public static void main(String[] args) {

    }
}
