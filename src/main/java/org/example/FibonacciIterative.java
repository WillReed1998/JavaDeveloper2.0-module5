package org.example;

//Просторова складність: O(1)
//Часова складність: O(n)

public class FibonacciIterative {
        public static long fibonacciIterative(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("n must be > 0");
            }
            else if (n <= 1) {
                return n;
            }

            int fibonacciIterative = 0;
            int previousPrevious = 0;
            int previous = 1;

            for(int i = 1; i < n; i++) {
                fibonacciIterative = previousPrevious + previous;
                previousPrevious = previous;
                previous = fibonacciIterative;

            }
            return fibonacciIterative;
        }
}
