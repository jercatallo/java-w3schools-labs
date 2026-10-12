package org.example.s01_basics.t10_math;

/**
 * W3Schools - Java Math: Math Methods
 * https://www.w3schools.com/java/java_math.asp
 */
public class JavaMath {
    public static void main (String[] args){
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.pow(2,8));

        System.out.println(Math.round(4.6));
        System.out.println(Math.ceil(4.6));
        System.out.println(Math.floor(4.6));
        System.out.println((int) (Math.random() * 101));
    }
}