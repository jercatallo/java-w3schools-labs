package org.example.s02_methods.t04_overloading;

/**
 * W3Schools - Java Method Overloading: Method Overloading
 * https://www.w3schools.com/java/java_methods_overloading.asp
 */
public class MethodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}