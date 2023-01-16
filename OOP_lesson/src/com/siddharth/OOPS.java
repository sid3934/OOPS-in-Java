/*

Constructors have 3 properties: They start with capital letter; Constructor name is same as class/ object name; They don't return anything
This covers 3 types of constructor: Parameterized, non parameterized and copy constructors.
 */

package com.siddharth;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something! from Pen");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        //this is a keyword that refers to the object under consideration of our class (whenever we construct an object out of Student class)
    }

//    Student(){ //non parameterised constructor
//        System.out.println("Constructor called!");
//    }
    Student(int age, String name){ //this is parameterised constructor here at the time of object construction we take in the parameters
        this.age=age; //this refers to the object constructed and this.age is the age supplied with the object and the other age refers to the class variable
        this.name=name; //thus at the time of object creation we dont have to write new lines to define each property
    }

//    Student (Student s2){ //this is copy constructor, copies properties from the object that is parameter to the object that is constructed
//        this.name = s2.name;
//        this.age = s2.age;
//    }
}

//Java doesn't have destructor like C++ instead it works on principle of garbage collection

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "yellow";
        pen1.type = "ball";
        pen1.write();
        Student s1 = new Student(10, "Siddharth");
        s1.printInfo();
    }
}