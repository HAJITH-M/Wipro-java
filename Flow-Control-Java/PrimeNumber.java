import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /**
         * Write a program to check if a given number is prime or not.
         */
        // Write your code here 👇 Print the o/p

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }
}
