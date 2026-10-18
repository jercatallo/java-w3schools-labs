package org.example.s03_classes.t11_inheritance;

/**
 * W3Schools - Java Inheritance: Inheritance
 * https://www.w3schools.com/java/java_inheritance.asp
 */

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Inheritance extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Inheritance myCar = new Inheritance();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
