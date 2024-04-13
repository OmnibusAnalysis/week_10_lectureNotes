package com.coderscampus.lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

import static java.time.format.DateTimeFormatter.*;

public class LocalDatesApplication {
    public static void main(String[] args) {
        //lesson9();

        //lesson10();
        try {
            LocalDateTime jan1 = LocalDateTime.parse("2020-01-01 3:00" , DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a"));
            System.out.println(jan1);

            LocalDate endOfFeb = LocalDate.of(2020, 02, 5).with(TemporalAdjusters.lastDayOfMonth());
            System.out.println(endOfFeb);

        } catch (DateTimeParseException e) {
            System.out.println("oops, your date is formatted incorrectly");
        }


    }

    private static void lesson10() {
        LocalDateTime jan1 = LocalDateTime.of(2020, 1, 1, 13, 30, 0);
        System.out.println(jan1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm:ss a")));

        LocalDateTime jan2 = LocalDateTime.of(2020, 1, 2, 9, 0, 0);
        System.out.println("is Jan1 before jan2?" + jan1.isBefore(jan2));

        LocalDateTime jan3 = jan1.plusDays(2);
        System.out.println("is jan3 before jan2? " +jan3.isBefore(jan2));

        jan3 = jan3.minus(1, ChronoUnit.DAYS);
        System.out.println(jan3);
    }

    private static void lesson9() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        ZonedDateTime zonedDatetime = ZonedDateTime.now();


        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime.format(ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(zonedDatetime.format(RFC_1123_DATE_TIME));
    }
}
