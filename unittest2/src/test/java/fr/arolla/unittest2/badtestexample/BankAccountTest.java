package fr.arolla.unittest2.badtestexample;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {
    @Test
    void date_of_transaction_is_set_to_now() {
        LocalDateTime dateTime = LocalDateTime.of(2017, 2, 13, 15, 56, 25);
        FakeClock clock = new FakeClock(dateTime);
        BankAccount bankAccount = new BankAccount(clock);
        bankAccount.deposit(100);

        List<Transaction> actualTransactions = bankAccount.getTransactions();

        assertEquals(1, actualTransactions.size());
        Transaction transaction = actualTransactions.get(0);
        assertEquals(dateTime, transaction.dateTime);
    }
}