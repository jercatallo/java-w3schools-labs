package org.example.s03_classes.t17_anonymous;

/**
 * W3Schools - Java Anonymous: Anonymous Classes
 * https://www.w3schools.com/java/java_anonymous.asp
 */
// Normal class
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class AnonymousClasses {
    public static void main(String[] args) {
        Animal myAnimal = new Animal() {
            public void makeSound() {
                System.out.println("Woof woof");
            }
        };

        myAnimal.makeSound();
    }
}