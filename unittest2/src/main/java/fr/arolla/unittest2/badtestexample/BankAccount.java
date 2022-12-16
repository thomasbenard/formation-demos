package fr.arolla.unittest2.badtestexample;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final List<Transaction> transactions = new ArrayList<>();
    private final ClockInterface clock;

    public BankAccount(ClockInterface clock) {
        this.clock = clock;
    }

    public BankAccount() {
        this.clock = new Clock();
    }

    public void deposit(int amount) {
        LocalDateTime now = clock.getNow();
        Transaction newTransaction = new Transaction(amount, now);
        transactions.add(newTransaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
