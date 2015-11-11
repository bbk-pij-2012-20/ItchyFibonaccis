//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

/*

Calculating the the nth Fibonacci number (using the series which starts at 1)
using a Java array and a for loop
Calculation of the 50th Fibonacci number takes between 1000 and 2000 nanoseconds

*/

public class Fib_IterateArray {

  private static long timeTaken;

  public static void main(String[] args) {

    int positionOfTheFibonacciThatIWant = 50;
    System.out.printf("The " + positionOfTheFibonacciThatIWant + "th Fibonacci number is %s\n", getFibonacciNumberAt(positionOfTheFibonacciThatIWant));
    System.out.println("Time taken for this calculation was " + timeTaken + " nanoseconds");

  }

// i:   1  2  3  4  5  6  7   8   9   10  11  12   13
// fib: 1  1  2  3  5  8  13  21  34  55  89  144  233

  public static long getFibonacciNumberAt(int n) {

    final long startTime = System.nanoTime();
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

    final long endTime = System.nanoTime();
    timeTaken = endTime - startTime;
    return fib;

  }

}
