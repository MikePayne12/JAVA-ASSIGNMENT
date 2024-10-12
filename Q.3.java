/*Write a program that will help kids learn divisibly test of numbers of integers. 
The program should check whether the given integer is divisible by integers in the range of 0-9. For example, if a number (955) is divisible by five, the program should print,
the number is divisible by 5 because it ends with a 5, and 900 is divisible by 5 because it ends with a 0(zero).*/

import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Divisibility tests:");

        for (int i = 0; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
        }

        if (number % 10 == 5) {
            System.out.println(number + " is divisible by 5 because it ends with a 5");
        }

        if (number % 10 == 0) {
            System.out.println(number + " is divisible by 10 because it ends with a 0");
        }
    }
}