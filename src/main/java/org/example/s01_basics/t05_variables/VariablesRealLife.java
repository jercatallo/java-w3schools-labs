package org.example.s01_basics.t05_variables;

/**
 * W3Schools - Java Variables: Real-Life Examples
 * https://www.w3schools.com/java/java_variables_reallife.asp
 */
public class VariablesRealLife {
        public static void main (String[] args){
            VariablesRealLife app = new VariablesRealLife();
            app.printStudentData("John Doe", 15, 23, 75.25f, 'B');
            app.printAreaOfRectangle(4, 6);
        }

        void printStudentData(String studentName, int studentId, int studentAge, float studentFee, char studentGrade){
            System.out.println("Student name: " + studentName);
            System.out.println("Student id: " + studentId);
            System.out.println("Student age: " + studentAge);
            System.out.println("Student fee: " + studentFee);
            System.out.println("Student grade: " + studentGrade);
        }

        void printAreaOfRectangle(int length, int width) {
            int area = length * width;

            System.out.println("Length is: " + length);
            System.out.println("Width is: " + width);
            System.out.println("Area of the rectangle is: " + area);
        }

}