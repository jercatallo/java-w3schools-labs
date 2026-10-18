package org.example.s03_classes.t02_classesobjects;

/**
 * W3Schools - Java Classes/Objects: Classes and Objects
 * https://www.w3schools.com/java/java_classes.asp
 */
public class ClassesObjects {
    public static void main(String[] args) {
        Second myObj = new Second();
        System.out.println(myObj.x);
    }
}

class Second {
    int x = 5;
}