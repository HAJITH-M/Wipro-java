
public class TwoCharacterVars {
    public static char first = 'a'; // Change this
    public static char second = 'b'; // Change this

    public static void main(String[] args) {
        /**
         *  Initialize two character variables in a program and display the characters in alphabetical order.
         *  Example1) if the first character is 's' and second character is 'e' then the output should be  e,s
         *  Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
         */
        // Write your code here 👇
        
        if (first > second) {
            System.out.println(second + "," + first);
        } else {
            System.out.println(first + "," + second);
        }
    }
}
