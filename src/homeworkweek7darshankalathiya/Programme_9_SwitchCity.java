package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_9_SwitchCity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        scanner.close();

        String city;

        switch (alphabet) {
            case 'A':
                city = "New York";
                break;
            case 'B':
                city = "Los Angeles";
                break;
            case 'C':
                city = "Chicago";
                break;
            case 'D':
                city = "San Francisco";
                break;
            case 'E':
                city = "Miami";
                break;
            case 'F':
                city = "Dallas";
                break;
            default:
                city = "Invalid entry";
        }

        System.out.println("City name: " + city);
    }
}
