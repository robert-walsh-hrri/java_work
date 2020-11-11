package com.company;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @org.junit.Test
    public void depositOperatesProperlyOnBalance() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(balance, 1200.00, 0);

        // having an issue with other commits
    }

    @org.junit.Test
    public void getBalanceReturnsBalance() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.getBalance();
        assertEquals("balance should be 1000, is not 1000", balance, 1000.00, 0);
    }

    @org.junit.Test
    public void withdrawalOperatesProperlyOnBalance() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.withdrawal(200.00, true);
        assertEquals(balance, 800.00, 0);
    }


}