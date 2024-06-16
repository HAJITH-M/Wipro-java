
public class ReceivedCLIArgs {
    public static void main(String[] args){
        /**
         *  Write a program to check if the program has received command line arguments or not.
            If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

            Example1) java Example
            O/P: No values

            Example2) java Example Mumbai Bangalore
            O/P: Mumbai,Bangalore

            [Hint: You can use length property of an array to check its length]
         */
        // Write your code here 👇
        if(args.length == 0) {
            System.out.println("No Values");
        } else {
            StringBuilder result = new StringBuilder();
            for (String arg : args) {
                result.append(arg).append(",");
            }
            // Remove the trailing comma
            System.out.println(result.substring(0, result.length() - 1));
        }
    }
}
