package fr.arolla.unittest2.badtestexample;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount) {
        LocalDateTime now = LocalDateTime.now();
        Transaction newTransaction = new Transaction(amount, now);
        transactions.add(newTransaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
