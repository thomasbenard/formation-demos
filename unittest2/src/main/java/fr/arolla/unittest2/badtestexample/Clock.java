package fr.arolla.unittest2.badtestexample;

import java.time.LocalDateTime;

public class Clock implements ClockInterface {
    public Clock() {
    }

    @Override
    public LocalDateTime getNow() {
        return LocalDateTime.now();
    }
}