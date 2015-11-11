//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

/*
Fibonacci Series
i:   1  2  3  4  5  6  7   8   9   10  11  12   13
fib: 1  1  2  3  5  8  13  21  34  55  89  144  233

Calculating the nth Fibonacci number using iteration and 3 primitive variables.
*/

public class Fib_Iteration {

  /**
  * Gets the nth Fibonacci Number using iteration.
  */
  public static long getFibonacciNumberAt(int n) {

    long fib = 1;

    try {

      if (n < 1) {

        throw new IllegalArgumentException("no fibonacci numbers at n < 1");

      } else if (n > 2) {

        long fib_1 = 1;
        long fib_2 = 1;
        fib = fib_1 + fib_2;

        for (int i = 3; i < n; i++) {

          fib_1 = fib_2;
          fib_2 = fib;
          fib = fib_1 + fib_2;

        }

      }

    } catch (IllegalArgumentException iae) {

      System.out.println(iae.getMessage());

    }

    return fib;

  }

}
