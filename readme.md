Fibonacci Series
--
starts either with 0 or 1. Series used here starts with 1. The position of the number in the series starts at 1 (labelled 'i'), the Fibonacci number at the position is shown below it (labelled 'fib'):

i:   1  2  3  4  5  6  7   8   9   10  11  12   13
fib: 1  1  2  3  5  8  13  21  34  55  89  144  233

I compare the conciseness and speed of computation for iteration and recursion to calculate the nth Fibonacci number, using Java 7.

iteration:
-
iteration is done using for loops.
In one class (Fib_Iteration), 3 variables are used only.
In another class (Fib_IterateArrayList), an arraylist is used instead.
The code using an arraylist is concise and clean, but is not as fast as with 3 variables.

recursion:
-
The code using recursion is concise and clean but becomes exponentially slower for n > 40.



Fibonacci calculations in other languages..
---
