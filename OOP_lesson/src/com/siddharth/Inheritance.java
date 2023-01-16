/*
Inheritance enhances he re-usability of a class
Types: Single level (one derived class from one base class),
    Multi level (base to child to grandchild),
    Heirarchial (multiple child classes of a single parent class)
    Hybrid inheritance (a branch has single inheritence, another branch has ,multi level, another has hierarchial
 */
package com.siddharth;


class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class Triangle extends Shape{
    //Triangle has already inherited the properties of Shape (which is color)
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends  Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color="red";
    }
}
