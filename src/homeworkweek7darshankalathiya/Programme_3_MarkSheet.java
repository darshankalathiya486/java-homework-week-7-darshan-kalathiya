package homeworkweek7darshankalathiya;

/**
 * Write programme that  print mark sheet and Calculate total and percentage
 * Using if else statement and Determine result and grade
 * also give grade.
 */

import java.util.Scanner;

public class Programme_3_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        // Input marks for three subjects
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();

        scanner.close();

        // Check if marks are in the valid range (0-100)
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
            return;
        }

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = "";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }

        // Print the mark sheet
        System.out.println("_______________________________");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("| Name : " + name+ "                    |");
        System.out.println("| Roll No: " + rollNo + "                    |");;
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("|_______________________________|");
        System.out.println("| Math : " + mathMarks +  "                     |");
        System.out.println("| Science : " + scienceMarks +  "                  |");
        System.out.println("| English : " + englishMarks +  "                  |");
        System.out.println("|_______________________________|");
        System.out.println("| Total : " + totalMarks +  "                   |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage : " + percentage + "%");
        System.out.println("| Result : " + result +  "                 |");
        System.out.println("| Grade : " + grade +  "                    |");
        System.out.println("|_______________________________|");
    }
}

