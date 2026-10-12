package org.example.s01_basics.t11_booleans;

/**
 * W3Schools - Java Booleans: Real-Life Example
 * https://www.w3schools.com/java/java_booleans_reallife.asp
 */
public class BooleansRealLife {
    public static void main(String[] args){
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge){
            System.out.println("old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }

}