//Q3
package leap_year;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        checkLeapYear();
    }

    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Output result
        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}