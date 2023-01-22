package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime localDateTime;
    private final Integer ROLL_OVER_TIME = 1_000_000_000;

    public Exercise004(LocalDate date) {
        this(date.atStartOfDay());
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime.plusSeconds(ROLL_OVER_TIME);
    }

    public LocalDateTime getDateTime() {
        return this.localDateTime;
    }
}
