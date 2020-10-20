package com.company;

public class Main {

    public static void main(String[] args) {
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + floatMinValue);
        System.out.println("Float maximum value = " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + doubleMinValue);
        System.out.println("Double maximum value = " + doubleMaxValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5d;
        // double is by default
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
    }
}
