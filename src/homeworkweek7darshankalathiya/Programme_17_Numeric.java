package homeworkweek7darshankalathiya;

import java.util.Arrays;

public class Programme_17_Numeric {
    public static void main(String[] args) {

        // Sorting a numeric array
        int[] numericArray = {5, 2, 9, 1, 5, 6, 3};
        System.out.println("Numeric array before sorting: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Numeric array after sorting: " + Arrays.toString(numericArray));

        // Sorting a string array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println("String array before sorting: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("String array after sorting: " + Arrays.toString(stringArray));
    }

}
