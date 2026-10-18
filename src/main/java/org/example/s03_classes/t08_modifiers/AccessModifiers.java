package org.example.s03_classes.t08_modifiers;

/**
 * W3Schools - Java Modifiers: Access Modifiers
 * https://www.w3schools.com/java/java_modifiers.asp
 */
class Person {
    public String name = "John";
    private int age = 30;
}

public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
//        System.out.println(p.age);
    }
}