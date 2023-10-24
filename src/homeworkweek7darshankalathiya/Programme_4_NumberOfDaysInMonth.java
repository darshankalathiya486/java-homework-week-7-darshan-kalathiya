package homeworkweek7darshankalathiya;

/**
 * Write a programme that check the year is leap or not
 * Logic of leap year  = y/4=0 and y/100=0 or y/4=0
 * Write a programme that check  if year is
 * leap how-many days in month
 */

import java.util.Scanner;

public class Programme_4_NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        // check the year is leap or not
        if (year >= 1 && year <= 9999) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                return true;
            } else {
                return false;
            }
            } else {
            return  false;
        }
    }

    // check the month and year number is in valid formant
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        // switch month in day
        int days;
        switch (month) {
            case 2:
                days = (isLeapYear(year)) ? 29 : 28;
                return days;
            case 4: case 6: case 9: case 11:
                days = 30;
                return days;
            default:
                days = 31;
                return days;

        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is leap year");
        int year = scanner.nextInt();
        System.out.println("Get days in month");
        int month = scanner.nextInt();
        boolean leap = isLeapYear(year);
        int days = getDaysInMonth(month,year);
        System.out.println(leap);
        System.out.println(days);
        scanner.close();
    }
}



