package org.example.s01_basics.t15_forloop;

/**
 * W3Schools - Java For Loop: Real-Life Examples
 * https://www.w3schools.com/java/java_for_loop_reallife.asp
 */
public class ForLoopRealLife {
    public static void main (String[] args){
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}