package org.example.s01_basics.t14_whileloop;

/**
 * W3Schools - Java While Loop: Do/While Loop
 * https://www.w3schools.com/java/java_while_loop_do.asp
 */
public class DoWhileLoop {
    public static void main (String[] args){
        int i = 10;

        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
    }
}
