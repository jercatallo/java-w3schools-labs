package org.example.s03_classes.t20_date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * W3Schools - Java Date: Date and Time
 * https://www.w3schools.com/java/java_date.asp
 */


//public class DateTime {
//    public static void main(String[] args) {
//        LocalDate myObj = LocalDate.now();
//        System.out.println(myObj);
//    }
//}

//public class DateTime {
//    public static void main(String[] args) {
//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);
//    }
//}

//public class DateTime {
//    public static void main(String[] args) {
//        LocalDateTime myObj = LocalDateTime.now();
//        System.out.println(myObj);
//    }
//}


public class DateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}