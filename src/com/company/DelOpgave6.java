package com.company;

import java.time.LocalDate;

public class DelOpgave6 {

    public LocalDate returnFirstDate(LocalDate date1, LocalDate date2) {

        int date1year = date1.getYear();
        int date2year = date2.getYear();

        int date1month = date1.getMonthValue();
        int date2month = date2.getMonthValue();

        int date1day = date1.getDayOfMonth();
        int date2day = date2.getDayOfMonth();

        if ( date1year > date2year ) {
            return  date2;
        } else if (date2year >  date1year) {
            return  date1;
        }
        if (date1month > date2month) {
            return date2;
        } else if (date2month > date1month ) {
            return date1;
        }

        if ( date1day > date2day ) {
            return  date2;
        } else {
            return  date1;
        }

    }






}
