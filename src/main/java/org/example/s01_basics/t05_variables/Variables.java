package org.example.s01_basics.t05_variables;

/**
 * W3Schools - Java Variables: Variables
 * https://www.w3schools.com/java/java_variables.asp
 */
public class Variables {
    static public void main (String[] args){
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        final int total = 100;
        System.out.println(total);

        float myFloatnum = 5.99f;
        char myLetter = 'D';
        boolean myBool = false;
        System.out.println("myFloatnum " + myFloatnum);
        System.out.println("myLetter " + myLetter);
        System.out.println("myBool " + myBool);


    }
}