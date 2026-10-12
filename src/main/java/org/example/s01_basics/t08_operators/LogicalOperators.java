package org.example.s01_basics.t08_operators;

/**
 * W3Schools - Java Operators: Logical
 * https://www.w3schools.com/java/java_operators_logical.asp
 */
public class LogicalOperators {
    public static void main (String[] args){
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in " + !isLoggedIn);
    }
}