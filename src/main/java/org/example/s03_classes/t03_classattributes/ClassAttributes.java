package org.example.s03_classes.t03_classattributes;

/**
 * W3Schools - Java Class Attributes: Class Attributes
 * https://www.w3schools.com/java/java_class_attributes.asp
 */
public class ClassAttributes {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.age = 25;
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

class Person {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
}