package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(args.length != 0 ? (String) args[0] : "No args");
        int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println(isEvenNumber(16));

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while (evenNumbers <= 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumbers++;
            System.out.println("Even number " + number);
        }
        System.out.println(evenNumbers);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0 ? true : false;
    }
}
