package org.example.s01_basics.t12_ifelse;

/**
 * W3Schools - Java If...Else: Real-Life Examples
 * https://www.w3schools.com/java/java_conditions_reallife.asp
 */
public class IfElseRealLife {
    public static void main (String[] args){
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            if (isCitizen) {
                System.out.println("Old enough and you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}