package org.example.s01_basics.t14_whileloop;

/**
 * W3Schools - Java While Loop: Real-Life Examples
 * https://www.w3schools.com/java/java_while_loop_reallife.asp
 */
public class WhileLoopRealLife {
    public static void main (String[] args){
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}
