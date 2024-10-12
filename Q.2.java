/*Write Java program to ask student to enter the marks of the five 
units they did last semester, compute the average and display it on 
the screen. (Average should be given in two decimal places).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMarks = 0;

        System.out.println("Enter the marks of five units:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Unit " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double average = totalMarks / 5;
        System.out.printf("The average marks is %.2f%n", average);
    }
}