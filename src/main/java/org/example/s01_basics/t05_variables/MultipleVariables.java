package org.example.s01_basics.t05_variables;

/**
 * W3Schools - Java Variables: Multiple Variables
 * https://www.w3schools.com/java/java_variables_multiple.asp
 */
public class MultipleVariables {
    public static void main (String[] args){
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        x = y = z = 50;
        System.out.println(x + y + z);
    }

}