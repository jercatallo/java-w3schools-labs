package org.example.s03_classes.t09_encapsulation;

/**
 * W3Schools - Java Encapsulation: Encapsulation
 * https://www.w3schools.com/java/java_encapsulation.asp
 */
public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}