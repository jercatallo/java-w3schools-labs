package org.example.s03_classes.t18_enums;

/**
 * W3Schools - Java Enum: Enums
 * https://www.w3schools.com/java/java_enums.asp
 */
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}
