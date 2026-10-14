package org.example.s01_basics.t17_arrays;

/**
 * W3Schools - Java Arrays: Loop Through an Array
 * https://www.w3schools.com/java/java_arrays_loop.asp
 */
public class LoopThroughArray {
    public static void main(String[] args) {
        final String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for(String car : cars){
            System.out.println(car + " 2");
        }
    }
}