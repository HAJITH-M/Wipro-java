import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        // A) Write a program to check if a given integer number is Positive, Negative, or Zero.
        // Write your code here 👇
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        int x = sc.nextInt();

        // Check if the number is negative, zero, or positive and print the result
        if (x < 0) {
            System.out.print("Negative"); // No newline
        } else if (x == 0) {
            System.out.print("Zero"); // No newline
        } else {
            System.out.print("Positive"); // No newline
        }

        // Close the Scanner object to free up resources
        sc.close();
    }
}
