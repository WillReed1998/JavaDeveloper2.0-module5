package org.example;

//Просторова складність: O(n)
//Часова складність: O(2^n)
public class FibonacciRecursive {
    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
