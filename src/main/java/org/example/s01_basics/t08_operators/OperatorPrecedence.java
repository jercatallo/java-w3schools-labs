package org.example.s01_basics.t08_operators;

/**
 * W3Schools - Java Operators: Precedence
 * https://www.w3schools.com/java/java_operators_precedence.asp
 */
public class OperatorPrecedence {
    public static void main (String[] args){
        int result1 = 10 - 2 + 5;
        int result2 = 10 - (2 + 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}