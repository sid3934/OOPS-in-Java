package com.siddharth;

/* abstract is the literal english meaning. an abstract class exists only conceptually and doesn't have a real object being constructed from it
objects are constructed from its child classes */
abstract class Animal{
    abstract void walk(); //since walk function is also abstract we dont have to write its implementation. we merely conceptually declared the existence of this function
    public void eats(){
        System.out.println("It eats!");
    }
    Animal(){
        System.out.println("Creating an animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("Created a horse");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse(); //at this point it will print both the statements from constructors of Animal and then Horse
        //this is called constructor chaining where base class constructor gets called first then derived class
        h1.walk(); h1.eats();
        Animal a1 = new Animal(); //this is an error as Animal (abstract classes) can't be instantiated
    }
}
