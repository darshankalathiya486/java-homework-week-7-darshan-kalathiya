package homeworkweek7darshankalathiya;

import java.util.Scanner;

public class Programme_5_Salary {

    static float hra;
    static float da;
    static float ta;
    static float pf;
    static float grossSalary;

    public static void calculation(float basicSalary){
        hra = 10*basicSalary/100;
        da = 8*basicSalary/100;
        ta = 9*basicSalary/100;
        pf = 20*basicSalary/100;
        grossSalary = basicSalary + hra + ta + da - pf;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee ID :  ");
        int employeeID = scanner.nextInt();
        System.out.print("Employee Name :  ");
        String name = scanner.next();
        System.out.print("Basic Salary :      ");
        float basicSalary = scanner.nextFloat();

        calculation(basicSalary);
        scanner.close();

        System.out.println("-----------------------------------------------------");
        System.out.println("|                    Salary Slip                    |");
        System.out.println("|___________________________________________________|");
        System.out.println("| Employee ID            : " + employeeID + "                     |");
        System.out.println("| Employee Name          : " + name + "                      |");
        System.out.println("| Basic Salary           : " + basicSalary + "                  |");
        System.out.println("| HAR 10%                : " + hra + "                   |");
        System.out.println("| DA 8%                  : " + da + "                   |");
        System.out.println("| TA 9%                  : " + ta + "                   |");
        System.out.println("| PF 20%                 : " + pf + "                   |");
        System.out.println("|                                                   |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Gross Salary           : " + grossSalary + "                  |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|---------------------------------------------------|");




    }



}
