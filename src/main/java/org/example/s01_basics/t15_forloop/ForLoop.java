package org.example.s01_basics.t15_forloop;

/**
 * W3Schools - Java For Loop: For Loop
 * https://www.w3schools.com/java/java_for_loop.asp
 */
public class ForLoop {
    public static void main (String[] args){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
}