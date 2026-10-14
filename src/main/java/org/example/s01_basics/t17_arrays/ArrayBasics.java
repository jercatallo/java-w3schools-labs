package org.example.s01_basics.t17_arrays;

/**
 * W3Schools - Java Arrays: Arrays
 * https://www.w3schools.com/java/java_arrays.asp
 */
public class ArrayBasics {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);

        int[] myNum = {10, 20, 30, 40};

        System.out.println(myNum.length);

        String[] cars2 = new String[4];
        cars2[0] = "Volvo 2";
        cars2[1] = "BMW 2";
        cars2[2] = "Ford 2";
        cars2[3] = "Mazda 2";
//        cars2[4] = "Mazda 2";
        System.out.println(cars2[0]);
    }
}