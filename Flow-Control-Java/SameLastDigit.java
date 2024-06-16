public class SameLastDigit {

    public static boolean lastDigit(int num1, int num2) {
        // Extract the last digit of both numbers using the modulus operator
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        
        // Return true if the last digits are the same, false otherwise
        return lastDigit1 == lastDigit2;
    }

    public static void main(String[] args) {
        /**
         * B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 
            lastDigit(7, 17) → true
            lastDigit(6, 17) → false
            lastDigit(3, 113) → true
         */
        
        // Test cases
        System.out.println(lastDigit(7, 17));   // true
        System.out.println(lastDigit(6, 17));   // false
        System.out.println(lastDigit(3, 113));  // true
    }
}
