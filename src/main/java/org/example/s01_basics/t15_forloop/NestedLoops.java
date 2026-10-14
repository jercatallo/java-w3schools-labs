package org.example.s01_basics.t15_forloop;

/**
 * W3Schools - Java For Loop: Nested Loops
 * https://www.w3schools.com/java/java_for_loop_nested.asp
 */
public class NestedLoops {
    public static void main (String[] args){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}