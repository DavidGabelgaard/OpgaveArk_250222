package com.company;

import java.time.LocalDate;

public class DelOpgave8 {

    public boolean isALeapYear(int year) {
        if (year % 100 == 0) {
            return (year % 400) == 0;
        }
        return year % 4 == 0;
    }


    public int calculateDay(LocalDate date) {

        int year = date.getYear();
        int month = date.getMonthValue();
        int  day = date.getDayOfMonth();

        int[] daysInMonths = { 31,28,31,30,31,30,31,31,30,31,30,31};

        if (isALeapYear(year)) {
            daysInMonths[1] = 29;
        }

        for (int i = 0; i < month - 1 ; i++) {
            day += daysInMonths[i];
        }
        return  day;

    }

}
