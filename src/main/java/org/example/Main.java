package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Step 1-----");
        LocalDateTime myTime = LocalDateTime.now();
        System.out.println("Meine Zeit: "+myTime);

        System.out.println("-----Step 2-----");
        myTime = myTime.plusWeeks(2);
        System.out.println("Meine Zeit plus 2 Wochen: " +myTime);

        System.out.println("-----Step 3-----");
        LocalDateTime time2 = myTime.minusDays(14);
        System.out.println("Zweiter Zeitpunkt: "+time2);
        if (time2.isAfter(myTime)) {
            System.out.println("Der zweite Zeitpunkt liegt in der Zukunft");
        } else {
            System.out.println("Der zweite Zeitpunkt liegt in der Vergangenheit");
        }
        System.out.println("-----Step 4-----");
        System.out.println("Zwei Zeitpunkte: ");
        LocalDate date1 = LocalDate.of(2024, 10, 16);
        LocalDate date2 = LocalDate.of(2024, 10, 10);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("Der Unterschied beträgt: ");

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween+" Tage");
    }
}