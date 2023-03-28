package method;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        System.out.print("Enter the third number: ");
        float num3 = input.nextFloat();

        // Calculate the sum and average of the three numbers using a user-defined method
        float sum = calculateSum(num1, num2, num3);
        float average = calculateAverage(num1, num2, num3);

        // Print the results
        System.out.println("The sum of the three numbers is: " + sum);
        System.out.println("The average of the three numbers is: " + average);
    }

    // A user-defined method to calculate the sum of three numbers
    public static float calculateSum(float num1, float num2, float num3) {
        return num1 + num2 + num3;
    }

    // A user-defined method to calculate the average of three numbers
    public static float calculateAverage(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }
}
