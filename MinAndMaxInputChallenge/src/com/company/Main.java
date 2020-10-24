package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int minNumber = Integer.MAX_VALUE;
	    int maxNumber = Integer.MIN_VALUE;

	    while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                if (number < minNumber) {
                    minNumber = number;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
            } else {
                System.out.println("Minimum entered is " + minNumber + ", and Maximum entered is " + maxNumber);
                break;
            }
            scanner.nextLine();
        }

	    scanner.close();
    }
}
