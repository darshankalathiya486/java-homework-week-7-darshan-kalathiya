package homeworkweek7darshankalathiya;

/**
 * Write a programme that check the number is odd or even
 * Logic of  even = num%2==0 is even
 * Logic of  odd = num%2==1 is odd
 */

import java.util.Scanner;

public class Programme_1_OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        // Use the ternary operator to check if the number is odd or even
        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The input number is " + result + ".");
    }
}
