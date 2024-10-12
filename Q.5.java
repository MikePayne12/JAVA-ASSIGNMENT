/* Create a calculator using java to help user perform the basic operations (+, -, * and /).
a. User should be asked to enter a number, then an operation, the program computes the operation and display the output to the computer screen. */ 

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter a valid operation (+, -, *, /).");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operation, num2, result);
    }
}