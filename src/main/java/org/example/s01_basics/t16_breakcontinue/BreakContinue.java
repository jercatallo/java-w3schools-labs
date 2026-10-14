package org.example.s01_basics.t16_breakcontinue;

/**
 * W3Schools - Java Break/Continue: Break and Continue
 * https://www.w3schools.com/java/java_break.asp
 */
public class BreakContinue {
    public static void main (String[] args){
        int[] numbers = {3, -1, 7, 0, 9};

        for (int n : numbers) {
            if (n < 0) {
                continue;
            }
            if (n == 0) {
                break;
            }

            System.out.println(n);
        }
    }
}