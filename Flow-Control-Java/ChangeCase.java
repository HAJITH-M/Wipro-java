public class ChangeCase {
    public static char ch = 'a'; // Change the value of ch to test the code

    public static void main(String[] args) {
        /**
         *  Initialize a character variable with an alphabet in a program.
         *
         *  If the character value is in lowercase, the output should be displayed in uppercase in the following format.
         *  Example1)
         *  i/p:a
         *  o/p:a->A
         *
         *  If the character value is in uppercase, the output should be displayed in lowercase in the following format.
         *  Example2)
         *  i/p:A
         *  o/p:A->a
         */
        // Write your code here 👇 Print the o/p
        
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid input.");
        }
    }
}
