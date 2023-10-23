package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_10_Symbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter a symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        scanner.close();

        double result;

        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid symbol. Please use +, -, *, or /.");
            return;
        }

        System.out.println("Result: " + result);
    }
}
