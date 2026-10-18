package org.example.s03_classes.t19_userinput;
import java.util.Scanner;

/**
 * W3Schools - Java User Input: User Input (Scanner)
 * https://www.w3schools.com/java/java_user_input.asp
 */

//class UserInput {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();
//        System.out.println("Username is: " + userName);
//    }
//}


class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}