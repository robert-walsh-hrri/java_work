package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int counter = 1;

	    int total = 0;

	    while (counter < 11) {
            System.out.println("Enter number #" + counter);
	        boolean hasNextInt = scanner.hasNextInt();
	        if (hasNextInt) {
	            total += scanner.nextInt();
	            scanner.nextLine();
	            counter++;
            }
        }

        System.out.println("Total is " + total);

	    scanner.close();
    }
}
