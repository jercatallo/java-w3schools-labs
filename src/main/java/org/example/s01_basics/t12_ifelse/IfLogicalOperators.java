package org.example.s01_basics.t12_ifelse;

/**
 * W3Schools - Java If...Else: Logical Operators
 * https://www.w3schools.com/java/java_conditions_logical.asp
 */
public class IfLogicalOperators {
    public static void main (String[] args){
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if(isLoggedIn && (isAdmin || securityLevel <= 2)){
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}