package org.example.s01_basics.t12_ifelse;

/**
 * W3Schools - Java If...Else: else if
 * https://www.w3schools.com/java/java_conditions_elseif.asp
 */
public class ElseIf {
    public static void main (String[] args){
        int weather = 3;

        if (weather == 1){
            System.out.println("Bring an umbrella.");
        } else if (weather == 2){
            System.out.println("Wear Sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }
    }
}