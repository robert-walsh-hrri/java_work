package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {1, 3, 5, 7, 9};

        System.out.println(Arrays.toString(testArray));

        reverse(testArray);

        System.out.println(Arrays.toString(testArray));
        
    }

    public static void reverse(int[] numbers) {
        var reversed = new int[numbers.length];

        for (var i = numbers.length - 1; i >= 0; i--) {

            reversed[numbers.length - 1 - i] = numbers[i];
        }

        for (var i = 0; i < reversed.length; i++) {

            numbers[i] = reversed[i];
        }
    }
}
