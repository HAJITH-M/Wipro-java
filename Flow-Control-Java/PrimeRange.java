public class PrimeRange {
    public static void main(String[] args) {
        /**
         * Write a Java program to find prime numbers between 10 and 99.
         * Each number should be printed in a separate row.
         */
        // Write your code here 👇 Print the o/p
        for (int i = 10; i <= 99; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
