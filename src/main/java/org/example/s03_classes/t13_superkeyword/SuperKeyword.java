package org.example.s03_classes.t13_superkeyword;

/**
 * W3Schools - Java super Keyword: The super Keyword
 * https://www.w3schools.com/java/java_super.asp
 */
//class Animal {
//  public void animalSound() {
//    System.out.println("The animal makes a sound");
//  }
//}
//
//class Dog extends Animal {
//  public void animalSound() {
//    super.animalSound();
//    System.out.println("The dog says: bow wow");
//  }
//}
//
//public class SuperKeyword {
//  public static void main(String[] args) {
//    Dog myDog = new Dog();
//    myDog.animalSound();
//  }
//}

//class Animal {
//  String type = "Animal";
//}
//
//class Dog extends Animal {
//  String type = "Dog";
//
//  public void printType() {
//    System.out.println(super.type);
//  }
//}
//
//public class SuperKeyword {
//  public static void main(String[] args) {
//    Dog myDog = new Dog();
//    myDog.printType();
//  }
//}

class Animal {
  Animal() {
    System.out.println("Animal is created");
  }
}

class Dog extends Animal {
  Dog() {
    super();
    System.out.println("Dog is created");
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Dog myDog = new Dog();
  }
}