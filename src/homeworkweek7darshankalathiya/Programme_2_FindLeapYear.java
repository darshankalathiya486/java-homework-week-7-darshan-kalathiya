package homeworkweek7darshankalathiya;

/**
 * Write a programme that check the year is leap or not
 * Logic of leap year  = y/4=0 and y/100=0 or y/4=0
 */

import java.util.Scanner;

public class Programme_2_FindLeapYear {
    //Main Method
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y =scanner.nextInt();

        // IfElse Condition use
        if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0)){
            System.out.println(y + " year is leap");
        }else {
            System.out.println(y + " year is not leap");
        }
        scanner.close();

    }
}
