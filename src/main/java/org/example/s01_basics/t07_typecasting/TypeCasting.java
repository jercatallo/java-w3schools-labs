package org.example.s01_basics.t07_typecasting;

/**
 * W3Schools - Java Type Casting: Type Casting
 * https://www.w3schools.com/java/java_type_casting.asp
 */
public class TypeCasting {
    public static void main (String[] args){
//        int myInt = 9;
//        double myDouble = myInt;
//
//        System.out.println(myInt);
//        System.out.println(myDouble);

//        double myDouble = 9.78d;
//        int myInt = (int) myDouble;
//
//        System.out.println(myDouble);
//        System.out.println(myInt);

        int maxScore = 500;

        int userScore = 423;


        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("User's percentage is " + percentage);
    }
}