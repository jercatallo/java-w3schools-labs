package org.example.s03_classes.t08_modifiers;

/**
 * W3Schools - Java Modifiers: Non-Access Modifiers
 * https://www.w3schools.com/java/java_non_modifiers.asp
 */
//public class NonAccessModifiers {
//    final int x = 10;
//    final double PI = 3.14;
//
//    public static void main(String[] args) {
//        NonAccessModifiers myObj = new NonAccessModifiers();
////        myObj.x = 50;
////        myObj.PI = 25;
//        System.out.println(myObj.x);
//    }
//}

// public class NonAccessModifiers {
//     // Static method
//     static void myStaticMethod() {
//         System.out.println("Static methods can be called without creating objects");
//     }

//     // Main method
//     public static void main(String[] args) {
//         myStaticMethod();
//         NonAccessModifiers.myStaticMethod();
//     }
// }

// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study();
}

// Subclass (inherit from Main)
class NonAccessModifiers extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}