package fr.arolla.unittest2.badtestexample;

import java.time.LocalDateTime;

public class FakeClock implements ClockInterface{
    private final LocalDateTime dateTime;

    public FakeClock(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public LocalDateTime getNow() {
        return dateTime;
    }
}
