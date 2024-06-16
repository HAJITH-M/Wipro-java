import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        /**
         * Write a program to reverse a given number and print

            Example1)
            I/P: 1234
            O/P: 4321

            Example2)
            I/P: 1004
            O/P: 4001
         */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println(reversedNumber);
    }
}
