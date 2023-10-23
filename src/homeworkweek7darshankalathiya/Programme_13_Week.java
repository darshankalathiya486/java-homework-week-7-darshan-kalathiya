package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_13_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        scanner.close();

        String day;

        switch (number) {
            case 1:
                day = "MONDAY";
                break;
            case 2:
                day = "TUESDAY";
                break;
            case 3:
                day = "WEDNESDAY";
                break;
            case 4:
                day = "THURSDAY";
                break;
            case 5:
                day = "FRIDAY";
                break;
            case 6:
                day = "SATURDAY";
                break;
            case 7:
                day = "SUNDAY";
                break;
            default:
                day = "Week contains 1 to 7 days";
        }

        System.out.println("Day of the week: " + day);
    }
}
