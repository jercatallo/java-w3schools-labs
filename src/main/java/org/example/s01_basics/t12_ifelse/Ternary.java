package org.example.s01_basics.t12_ifelse;

/**
 * W3Schools - Java If...Else: Short Hand If...Else
 * https://www.w3schools.com/java/java_conditions_shorthand.asp
 */
public class Ternary {
    public static void main (String[] args){
        int time = 20;
        String result = (time < 18) ? "Good day.": "Good evening.";
        System.out.println(result);
    }
}