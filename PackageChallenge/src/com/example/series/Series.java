package com.example.series;

public class Series {

    public static int nSum(int n) {
        int returnSum = 0;
        for (int i = 1; i <= n; i++) {
            returnSum += i;
        }

        return returnSum;
    }

    public static int factorial(int n) {
        int returnProduct = 1;
        for (int i = 1; i <= n; i++) {
            returnProduct *= i;
        }

        return returnProduct;
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
