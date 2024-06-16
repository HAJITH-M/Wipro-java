import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        // C) Write a program to check if a given integer number is odd or even. Note lowercase 'o' for odd and 'e' for even.
        // Write your code here 👇
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        int x = sc.nextInt();

        // Check if the number is odd or even and print the result
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}
