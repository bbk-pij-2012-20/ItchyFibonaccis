#include<stdio.h>

int main() {

  int n, fib_2 = 0, fib_1 = 1, fib, i;
  printf("Enter the number of Fibonacci numbers you want\n");
  scanf("%d",&n);
  printf("fib_2 %d numbers from start of Fibonacci series are :-\n",n);

  for (i = 0 ;i < n ;i++) {

    if (i <= 1) {

      fib = i;

    } else {

      fib = fib_2 + fib_1;
      fib_2 = fib_1;
      fib_1 = fib;

    }

    printf("%d\n",fib);

  }

  return 0;

}
