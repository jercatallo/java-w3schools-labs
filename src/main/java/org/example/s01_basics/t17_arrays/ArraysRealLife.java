package org.example.s01_basics.t17_arrays;

/**
 * W3Schools - Java Arrays: Real-Life Examples
 * https://www.w3schools.com/java/java_arrays_reallife.asp
 */
public class ArraysRealLife {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);

        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        System.out.println("The lowest age in the array is: " + lowestAge);

        int max = ages[0];
        int min = ages[0];

        for (int n : ages) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}