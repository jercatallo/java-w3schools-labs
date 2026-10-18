package org.example.s03_classes.t16_interface;

/**
 * W3Schools - Java Interface: Interfaces
 * https://www.w3schools.com/java/java_interface.asp
 */
// Interface
//interface Animal {
//    public void animalSound();
//    public void sleep();
//}
//

//class Pig implements Animal {
//    public void animalSound() {
//        System.out.println("The pig says: wee wee");
//    }
//    public void sleep() {
//        System.out.println("Zzz");
//    }
//}
//
//class Interface {
//    public static void main(String[] args) {
//        Pig myPig = new Pig();
//        myPig.animalSound();
//        myPig.sleep();
//    }
//}

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}