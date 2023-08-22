package org.example;

public class App {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FibonacciDP.fibonacciDP(10));
        System.out.println(FibonacciRecursive.fibonacciRecursive(10));
        System.out.println(FibonacciIterative.fibonacciIterative(10));
    }
}
