package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u00A9';
        // can only store a single character
        // two bytes of memory width of 16
        System.out.println(myUnicodeChar);

        boolean myBool = true;
        boolean myFalseBool = false;

        System.out.println(myBool);
        System.out.println(myFalseBool);
    }
}
