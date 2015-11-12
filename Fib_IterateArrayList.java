//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

import java.util.List;
import java.util.ArrayList;

public class Fib_IterateArrayList {

  /**
  * Gets the nth Fibonacci Number using iteration and an arraylist.
  */
  public static long getFibonacciNumberAt(int n) {

    List<Long> fibonacciList = new ArrayList<>();
    fibonacciList.set(0,1L);

    try {

      if (n < 1) {

        throw new IllegalArgumentException("no fibonacci numbers at n < 1");

      } else if (n > 2) {

        fibonacciList.set(1,1L);

        for (int i = 2; i < n; i++) {

          fibonacciList.set(i, fibonacciList.get(i - 1) + fibonacciList.get(i - 2));

        }

      }

    } catch (IllegalArgumentException iae) {

      System.out.println(iae.getMessage());

    }

    return fibonacciList.get(fibonacciList.size() - 1);

  }

}
