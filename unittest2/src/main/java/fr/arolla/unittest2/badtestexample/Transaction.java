package fr.arolla.unittest2.badtestexample;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    public final int amount;
    public final LocalDateTime dateTime;

    public Transaction(int amount, LocalDateTime now) {
        this.amount = amount;
        this.dateTime = now;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount && dateTime.equals(that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, dateTime);
    }
}
