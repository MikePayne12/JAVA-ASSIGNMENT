/* Write a Java program that asks the user to enter their sur name and current age then print the number of characters of their sir name and even or odd depending on their age number. 
Example of Expected result:
If sir name is Saruni and age is 29, output will be;
then the number of characters is 6.
Your current age is an odd number */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        int surnameLength = surname.length();
        String ageStatus = (age % 2 == 0) ? "even" : "odd";

        System.out.println("The number of characters in your surname is " + surnameLength + ".");
        System.out.println("Your current age is " + ageStatus + " number.");
    }
}
