Fibonacci Series
--
Starts either with 0 or 1.

The Fibonacci Series used here always starts with 1.

The nth number in the series is one-based shown here above Fibonacci numbers (fib)

|  n |  1 | 2  | 3  |4   |5   |6   |7   |8   |9   |10   |11   |12   |13   |etc  |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
|  fib | 1  | 1  | 2  | 3  | 5  | 8  | 13  | 21  | 34  | 55  | 89  | 144  | 233  | etc  |

My aim is to compare conciseness and speed of computation for iteration and for recursion.

The task of the computation is to calculate the nth Fibonacci number given the value n.

This is done using Java 1.7.

Iteration:
-
I use for loops in two classes.
In one class (Fib_Iteration), three variables are used to store and calculate the Fibonacci numbers.
In the other class (Fib_IterateArrayList), I've used an arraylist instead three variables.

Conclusion: The code using an arraylist is concise and clean, but is not as fast as with 3 variables.

Recursion:
-
The code using recursion is concise and clean but becomes exponentially slower than iteration for n > 40.

-------------

Fibonacci calculations in other languages..
---
