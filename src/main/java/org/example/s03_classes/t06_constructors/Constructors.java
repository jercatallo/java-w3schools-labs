package org.example.s03_classes.t06_constructors;

/**
 * W3Schools - Java Constructors: Constructors
 * https://www.w3schools.com/java/java_constructors.asp
 */
public class Constructors {
    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }

}