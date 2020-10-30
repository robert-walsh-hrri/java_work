package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SaveStrings implements ISaveable{
    private ArrayList<String> fields;

    public SaveStrings() {
        this.fields = new ArrayList<String>();
        populateValues(saveValues());
    }

    @Override
    public ArrayList<String> saveValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    @Override
    public void populateValues(ArrayList<String> values) {
        this.fields.addAll(values);
    }
}






































