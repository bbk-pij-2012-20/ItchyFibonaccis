//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

public class Fib_Recursion {

  /**
  * Gets the nth Fibonacci Number using recursion.
  */
  public static long getFibonacciNumberAt(int n) {

    try {

      if (n < 1) {

        throw new IllegalArgumentException("no fibonacci numbers at n < 1");

      } else if (n == 1 || n == 2) {

        return 1;

      }

    } catch (IllegalArgumentException iae) {

      System.out.println(iae.getMessage());

    }

    return getFibonacciNumberAt(n - 1) + getFibonacciNumberAt(n - 2);

  }

}
