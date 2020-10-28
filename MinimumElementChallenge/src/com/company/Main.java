package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Please enter in a number of integers");
        count = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = readIntegers(count);
        System.out.println(findMin(numbers));
        System.out.println(Locale.getDefault());
        scanner.close();
    }

    public static int[] readIntegers(int number) {
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return numbers;
    }

    public static int findMin(int[] numbers) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }
}
