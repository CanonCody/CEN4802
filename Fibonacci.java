
/**
 *  This class is used to find the fibonacci number.
 *  @author Cody Jones
 *  @para n - the number to find the fibonacci number of.
 *  @return the fibonacci number of the given number.
 */

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("The nth term of the Fibonacci sequence is " + fibonacci(10));
    }

    // This method is used to find the fibonacci number of a given number.
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
