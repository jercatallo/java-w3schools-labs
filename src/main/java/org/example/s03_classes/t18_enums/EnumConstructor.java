package org.example.s03_classes.t18_enums;

/**
 * W3Schools - Java Enum: Enum Constructor
 * https://www.w3schools.com/java/java_enum_constructor.asp
 */
enum Levels {
    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");

    private String description;

    private Levels(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        Levels myVar = Levels.MEDIUM;
        System.out.println(myVar.getDescription());
    }
}
