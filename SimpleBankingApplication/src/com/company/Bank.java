package com.company;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public static void addBranch() {
        branches.add(new Branch());
    }

    public static Branch getBranch() {
        return branches.get((int)Math.random());
    }
}
