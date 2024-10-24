import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double assignment1, assignment2, cat1, cat2, average;

        // Input marks
        System.out.println("Enter Assignment 1 marks:");
        assignment1 = input.nextDouble();

        System.out.println("Enter Assignment 2 marks:");
        assignment2 = input.nextDouble();

        System.out.println("Enter CAT 1 marks:");
        cat1 = input.nextDouble();

        System.out.println("Enter CAT 2 marks:");
        cat2 = input.nextDouble();

        // Calculate average
        average = (assignment1 + assignment2 + cat1 + cat2) / 4;

        // Display average
        System.out.println("\nCoursework Average: " + average);
        System.out.print("Grade: ");

        // Determine grade using if-else statements
        if (average >= 40 && average <= 50) {
            System.out.println("A");
        } else if (average >= 30 && average <= 39) {
            System.out.println("B");
        } else if (average >= 20 && average <= 29) {
            System.out.println("C");
        } else if (average >= 10 && average <= 19) {
            System.out.println("D");
        } else if (average >= 0 && average <= 9) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Grade");
        }

        input.close();
    }
}