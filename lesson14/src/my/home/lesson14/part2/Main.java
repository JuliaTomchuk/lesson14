package my.home.lesson14.part2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();


        TemporalAdjuster temporalAdjuster = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println("Next Tuesday: " + date.with(temporalAdjuster));


    }
}