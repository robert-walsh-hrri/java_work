package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("and I am scared of aliens");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore <= 100) {
            System.out.println("inside conditional");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error.");
        }

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;

        double variable = 20.00;
        double secondVariable = 80.00;
        boolean testVariable = (((variable + secondVariable) * 100) % 40.00) == 0 ? true : false;

        if (!testVariable) {
            System.out.println("Got some remainder");
        }

    }
}
