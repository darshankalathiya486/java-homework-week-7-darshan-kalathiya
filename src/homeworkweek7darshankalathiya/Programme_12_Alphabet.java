package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_12_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = scanner.nextLine();

        scanner.close();

        if (input.length() == 1) {
            char character = input.charAt(0);

            if (Character.isDigit(character)) {
                System.out.println("Input is a number.");
            } else if (Character.isLetter(character)) {
                System.out.println("Input is an alphabet.");
            } else {
                System.out.println("Input is a symbol.");
            }
        } else {
            System.out.println("Input is not a single character.");
        }
    }
}
