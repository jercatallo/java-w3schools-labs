package org.example.s01_basics.t09_strings;

/**
 * W3Schools - Java Strings: Strings
 * https://www.w3schools.com/java/java_strings.asp
 */
public class Strings {
    public static void main (String[] args){
        String greeting = "Hello World";
        String greeting2 = "Hello World";
        String greeting3 = "Hello Mars";
        System.out.println("The length of the greeting string is: " + greeting.length());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.indexOf("World"));
        System.out.println(greeting.charAt(6));

        System.out.println(greeting.equals(greeting2));
        System.out.println(greeting.equals(greeting3));

        System.out.println("    Hello Jupiter       ".trim());
    }
}