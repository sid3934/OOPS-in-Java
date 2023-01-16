/*
Polymorphism has 2 types: function overloading (compile time polymorphism) and function overriding(runtime polymorphism).
Function overloading means having different function of same name.
These same but different functions differ on the basis of:
    parameters of the function or
    different return types if same parameters or
    different number of arguments if same return type and same argument type.
 */
/*
Below is an example of function overloading (a class has different functions of the same name)
 */
package com.siddharth;

class Car{
    String brand;
    String category;

    Car(String brand, String Category){
        this.brand=brand;
        this.category=category;
    }
    public void returnInfo(String brand){
        System.out.println(brand);
    }
    public void returnInfo(String brand, String category){
        System.out.println("This car is a " + brand + " but " + category);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "PV");
        c1.returnInfo("Toyota");
        c1.returnInfo("Toyota", "Luxury");
    }
}
