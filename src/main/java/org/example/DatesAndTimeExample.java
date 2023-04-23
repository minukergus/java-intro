package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DatesAndTimeExample {

    public static void main(String[] args) {
        System.out.println("Let's play with java time API");

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current time is: " + currentTime);

        // factory method
        LocalDateTime anotherDateTime = LocalDateTime.of(
                2011,
                12,
                10,
                10,
                10
        );
        System.out.println("Another date time is: " + anotherDateTime);

        LocalDate justDate = LocalDate.now();
        System.out.println("Just date: " + justDate);

        LocalDateTime newYorkTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("New York time should be: " + newYorkTime);
    }
}