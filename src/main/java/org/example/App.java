package org.example;


import static org.example.FibonacciDP.fibonacciDP;
import static org.example.FibonacciRecursive.fibonacciRecursive;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FibonacciDP.fibonacciDP(10));
        System.out.println(FibonacciRecursive.fibonacciRecursive(10));
        System.out.println(FibonacciIterative.fibonacciIterative(10));
    }
}
