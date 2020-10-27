package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] numbers = getIntegers(5);
        printArray(numbers);
        sortArray(numbers);
        printArray(numbers);
    }

    public static Integer[] getIntegers(int number) {
        Integer[] numbers = new Integer[number];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter in a number \r");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array at " + i + " is " + array[i]);
        }
    }

    public static Integer[] sortArray(Integer[] array) {
        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }
}
