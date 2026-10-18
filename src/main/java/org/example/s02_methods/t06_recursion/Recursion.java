package org.example.s02_methods.t06_recursion;

/**
 * W3Schools - Java Recursion: Recursion
 * https://www.w3schools.com/java/java_recursion.asp
 */
public class Recursion {
    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}