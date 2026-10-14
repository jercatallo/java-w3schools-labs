package org.example.s01_basics.t17_arrays;

/**
 * W3Schools - Java Arrays: Multidimensional Arrays
 * https://www.w3schools.com/java/java_arrays_multi.asp
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }

    }
}