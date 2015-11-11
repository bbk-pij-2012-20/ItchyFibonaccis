//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

/*
Fibonacci Series
i:   1  2  3  4  5  6  7   8   9   10  11  12   13
fib: 1  1  2  3  5  8  13  21  34  55  89  144  233

Calculating the nth Fibonacci number using recursion.
*/

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
