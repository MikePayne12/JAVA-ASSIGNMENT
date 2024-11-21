//Q2
import java.util.Scanner;

// Package declaration
package units_marks;

public class MarksCalculator {
    // Method to input marks and calculate average
    public void calculateMarks() {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store marks for each unit
        double javaProgrammingMarks, networkingMarks, mathsMarks;
        
        // Prompt for Java Programming marks
        System.out.print("Enter marks for Java Programming: ");
        javaProgrammingMarks = scanner.nextDouble();
        
        // Prompt for Networking marks
        System.out.print("Enter marks for Networking: ");
        networkingMarks = scanner.nextDouble();
        
        // Prompt for Maths marks
        System.out.print("Enter marks for Maths: ");
        mathsMarks = scanner.nextDouble();
        
        // Calculate average
        double average = (javaProgrammingMarks + networkingMarks + mathsMarks) / 3;
        
        // Output the results
        System.out.println("Marks for Java Programming is: " + javaProgrammingMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of the class
        MarksCalculator calculator = new MarksCalculator();
        
        // Call the calculateMarks method
        calculator.calculateMarks();
    }
}