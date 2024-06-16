
public class GenderPercentage {
    public static void main(String[] args) {
        /**
         Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

        If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

        If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

        If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

        If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
         */

        // Write your code here 👇 Print the o/p
        if (args.length != 2) {
            System.out.println("Please provide gender and age as command line arguments.");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        double interestPercentage;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 9.2;
            } else {
                System.out.println("Invalid age.");
                return;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestPercentage = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestPercentage = 10.5;
            } else {
                System.out.println("Invalid age.");
                return;
            }
        } else {
            System.out.println("Invalid gender.");
            return;
        }

        System.out.printf("%.1f%%\n", interestPercentage);
    }
}
