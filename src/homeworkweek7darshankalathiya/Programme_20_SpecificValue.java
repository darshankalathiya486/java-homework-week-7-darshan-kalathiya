package homeworkweek7darshankalathiya;

public class Programme_20_SpecificValue {

    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 10, 15, 20, 25};

        // Value to check
        int targetValue = 15;

        // Initialize a boolean variable to track if the value is found
        boolean found = false;

        // Iterate through the array to check if it contains the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break; // Exit the loop as soon as the value is found
            }
        }

        // Check and print the result
        if (found) {
            System.out.println("The array contains the target value: " + targetValue);
        } else {
            System.out.println("The array does not contain the target value: " + targetValue);
        }
    }
}
