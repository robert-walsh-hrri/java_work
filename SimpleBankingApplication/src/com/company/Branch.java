package com.company;

import java.util.ArrayList;


public class Branch {

    private static ArrayList<Customer> customerList;

    public Branch() {
        this.customerList = new ArrayList<Customer>();
    }

    public static void addCustomer(String name) {
        customerList.add(new Customer(name));
    }

    public static void addTransaction(String name, double transaction) {
        int index = getCustomer(name);

        customerList.get(index).setTransactions(transaction);
    }

    public static void printCustomers() {
        for (int i = 0; i < customerList.size(); i++) {
            Customer currentCustomer = customerList.get(i);
            for (int j = 0; j < currentCustomer.getTransactions().size(); j++) {
                System.out.println(currentCustomer.getName() + " "
                        + currentCustomer.getTransactions().get(j));
            }
        }
    }

    private static int getCustomer(String name) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName() == name) {
                return i;
            }
        }

        return -1;
    }
}
