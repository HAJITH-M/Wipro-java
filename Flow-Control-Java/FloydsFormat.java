public class FloydsFormat {
    public static void main(String[] args) {
        /**
         *  Write a program to print * in Floyds format (using for and while loop)
            *
            *  *
            *  *   *

            Example1)
            C:\>java Sample 
            O/P: Please enter an integer number
            
            Example2)
            C:\>java Sample 3
            O/P :
            *
            *  * 
            *  *  *

         */
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
