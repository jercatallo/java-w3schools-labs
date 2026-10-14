package org.example.s01_basics.t12_ifelse;

/**
 * W3Schools - Java If...Else: if
 * https://www.w3schools.com/java/java_conditions.asp
 */
public class IfStatement {
    public static void main (String[] args){
        int x = 20;
        int y = 18;
        boolean isXGreatherThanY = x > y;
        if (isXGreatherThanY){
            System.out.println("x is greather than y");
            System.out.println("Both lines are part of the if");
        }

        System.out.println("I am outside if, not part of if!");
    }
}