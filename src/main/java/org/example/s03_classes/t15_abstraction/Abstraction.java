package org.example.s03_classes.t15_abstraction;

/**
 * W3Schools - Java Abstraction: Abstract Classes and Methods
 * https://www.w3schools.com/java/java_abstract.asp
 */

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}