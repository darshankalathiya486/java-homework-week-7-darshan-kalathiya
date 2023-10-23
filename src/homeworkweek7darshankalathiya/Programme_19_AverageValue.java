package homeworkweek7darshankalathiya;

public class Programme_19_AverageValue {

    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 10, 15, 20, 25};

        // Initialize variables for sum and average
        int sum = 0;
        double average;

        // Calculate the sum of the array elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        int numberOfElements = numbers.length;
        average = (double) sum / numberOfElements;
        System.out.println("Average of the array elements: " + average);
    }
}
