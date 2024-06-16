
import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        /**
         * Write a program to receive a color code from the user (an Alphabet).
         *
         * The program should then print the color name, based on the color code given.
         *
         * The following are the color codes and their corresponding color names.
         * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
         *
         * If color code provided by the user is not valid then print "Invalid Code".
         */

        // Write your code here 👇 and Print o/p
        Scanner scanner = new Scanner(System.in);

        char colorCode = scanner.next().toUpperCase().charAt(0);

        String colorName;

        switch (colorCode) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
        }

        System.out.println(colorName);
    }
}
