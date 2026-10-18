package org.example.s03_classes.t07_thiskeyword;

/**
 * W3Schools - Java this Keyword: The this Keyword
 * https://www.w3schools.com/java/java_this.asp
 */
public class ThisKeyword {
    int modelYear;
    String modelName;

    public ThisKeyword(String modelName) {
        this(2020, modelName);
    }

    public ThisKeyword(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        ThisKeyword car1 = new ThisKeyword("Corvette");
        ThisKeyword car2 = new ThisKeyword(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}