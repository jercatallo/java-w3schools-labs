package org.example.s02_methods.t05_scope;

/**
 * W3Schools - Java Scope: Scope
 * https://www.w3schools.com/java/java_scope.asp
 */
public class Scope {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Loop 1: " + i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Loop 2: " + i);
        }
    }

}