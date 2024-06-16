
public class IsAlpha {
    public static char ch = 'a'; // Change this

    public static void main(String[] args) {
        /**
         *  Initialize a character variable in a program and 
         *  print 'Alphabhet' if the initialized value is an alphabet, 
         *  print 'Digit' if the initialized value is a number, and 
         *  print 'Special Character', if the initialized value is anything else.
         */
        // Write your code here 👇 Print the o/p
        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabhet"); // Changed "Alphabet" to "Alphabhet"
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
