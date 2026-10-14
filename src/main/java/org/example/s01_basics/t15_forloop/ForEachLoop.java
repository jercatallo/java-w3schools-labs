package org.example.s01_basics.t15_forloop;

/**
 * W3Schools - Java For Loop: For-Each Loop
 * https://www.w3schools.com/java/java_foreach_loop.asp
 */
public class ForEachLoop {
    public static void main (String[] args){
        int[] numbers = {10, 20, 30, 40};
        for(int num: numbers){
            System.out.println(num);
        }
    }
}