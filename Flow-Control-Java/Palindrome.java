import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /**
         * Write a Java program to find if the given number is palindrome or not

            Example1)
            C:\>java Sample 110011
            O/P: 110011 is a palindrome

            Example2)
            C:\>java Sample 1234
            O/P: 1234 is not a palindrome
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }
}
