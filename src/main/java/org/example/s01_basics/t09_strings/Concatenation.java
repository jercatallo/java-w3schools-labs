package org.example.s01_basics.t09_strings;

/**
 * W3Schools - Java Strings: Concatenation
 * https://www.w3schools.com/java/java_strings_concat.asp
 */

public class Concatenation {
    public static void main(String[] args){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);
    }
}