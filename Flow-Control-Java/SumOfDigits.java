import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        /**
         *  Write a program to print the sum of all the digits of a given number.
            Example1) 
            I/P:1234
            O/P:10
         */
        Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int sum = 0;

    // Calculate the sum of digits
    while (number != 0) {
        sum += number % 10;
        number /= 10;
    }

    // Print the sum
    System.out.println(sum);
    }
}
