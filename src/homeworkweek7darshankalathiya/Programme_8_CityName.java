package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_8_CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        scanner.close();

        String city;

        if (alphabet == 'A') {
            city = "New York";
        } else if (alphabet == 'B') {
            city = "Los Angeles";
        } else if (alphabet == 'C') {
            city = "Chicago";
        } else if (alphabet == 'D') {
            city = "San Francisco";
        } else if (alphabet == 'E') {
            city = "Miami";
        } else if (alphabet == 'F') {
            city = "Dallas";
        } else {
            city = "Invalid entry";
        }

        System.out.println("City name: " + city);
    }
}
