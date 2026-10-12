package org.example.s01_basics.t06_datatypes;

/**
 * W3Schools - Java Data Types: Real-Life Example
 * https://www.w3schools.com/java/java_data_types_reallife.asp
 */


public class DataTypesRealLife {
    public static void main (String[] args){
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem);
        System.out.println("Total cost = " + currency + totalCost);

    }
}