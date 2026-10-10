package org.example.s01_basics.t05_variables;

/**
 * W3Schools - Java Variables: Print Variables
 * https://www.w3schools.com/java/java_variables_print.asp
 */
public class PrintVariables {
    public static void main (String[] args){
        String firstname = "John ";
        String lastName = "Doe";
        String fullName = firstname + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        System.out.println("The sum is " + x + y);
        System.out.println("The sum is " + (x + y));

    }
}