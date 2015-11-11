//cd ~/Desktop/all_pooled/computing/CODING/ItchyFibonaccis

/*
Main method to call 3 different methods for calculating nth Fibonacci number (for the Fibonacci series that starts at 1)
1. iteration 2. recursion, 3. iteration with an arraylist
For each method, the 40th, 45th and 50th Fibonacci Numbers are sought.
The time taken for each method to perform the calculation is given.
*/

public class Fib_PSVM {

  public static void main(String[] args) {

    String method1 = "iteration";
    String method2 = "recursion";
    String method3 = "iteration with a Java arrayList";
    int position = 40;
    final long startTime1 = System.nanoTime();
    long fibonacciNumber = Fib_Iteration.getFibonacciNumberAt(position);
    final long endTime1 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime1 - startTime1, method1);

    final long startTime2 = System.nanoTime();
    fibonacciNumber = Fib_Recursion.getFibonacciNumberAt(position);
    final long endTime2 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime2 - startTime2, method2);

    final long startTime3 = System.nanoTime();
    fibonacciNumber = Fib_IterateArrayList.getFibonacciNumberAt(position);
    final long endTime3 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime3 - startTime3, method3);

    position = 45;
    final long startTime4 = System.nanoTime();
    fibonacciNumber = Fib_Iteration.getFibonacciNumberAt(position);
    final long endTime4 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime4 - startTime4, method1);

    final long startTime5 = System.nanoTime();
    fibonacciNumber = Fib_Recursion.getFibonacciNumberAt(position);
    final long endTime5 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime5 - startTime5, method2);

    final long startTime6 = System.nanoTime();
    fibonacciNumber = Fib_IterateArrayList.getFibonacciNumberAt(position);
    final long endTime6 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime6 - startTime6, method3);

    position = 50;
    final long startTime7 = System.nanoTime();
    fibonacciNumber = Fib_Iteration.getFibonacciNumberAt(position);
    final long endTime7 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime7 - startTime7, method1);

    final long startTime8 = System.nanoTime();
    fibonacciNumber = Fib_Recursion.getFibonacciNumberAt(position);
    final long endTime8 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime8 - startTime8, method2);

    final long startTime9 = System.nanoTime();
    fibonacciNumber = Fib_IterateArrayList.getFibonacciNumberAt(position);
    final long endTime9 = System.nanoTime();
    printOut(position, fibonacciNumber, endTime9 - startTime9, method3);

  }

  /**
  * Prints out time as ns, us, ms or seconds
  */
  private static void printOut(int position, long fibonacciNumber, long nanoseconds, String method) {

    String units = "nanoseconds";
    long timeTaken = nanoseconds;

    if (timeTaken > 1000) {

      timeTaken /= 1000;
      units = " microseconds";

      if (timeTaken > 1000) {

        timeTaken /= 1000;
        units = " milliseconds";

      }

      if (timeTaken > 1000) {

        timeTaken /= 1000;
        units = " seconds";

      }

    }

    System.out.printf("The " + position + "th Fibonacci number is %s\n", fibonacciNumber);
    System.out.println("Time taken by " + method + " was " + timeTaken + " " + units);

  }

}
