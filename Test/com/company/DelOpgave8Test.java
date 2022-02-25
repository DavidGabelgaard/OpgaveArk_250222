package com.company;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DelOpgave8Test {

    @Test
    public void isALeapYear() {

        DelOpgave8 delOpgave8 = new DelOpgave8();

        boolean isLeapYear = delOpgave8.isALeapYear(2024);

        assertTrue(isLeapYear);

    }
    @Test
    public void isNotALeapYear() {

        DelOpgave8 delOpgave8 = new DelOpgave8();

        boolean isLeapYear = delOpgave8.isALeapYear(2023);

        assertFalse(isLeapYear);

    }
    @Test
    public void isALeapYear1() {

        DelOpgave8 delOpgave8 = new DelOpgave8();

        boolean isLeapYear = delOpgave8.isALeapYear(2000);

        assertTrue(isLeapYear);

    }
    @Test
    public void isNotALeapYear2() {

        DelOpgave8 delOpgave8 = new DelOpgave8();

        boolean isLeapYear = delOpgave8.isALeapYear(1900);

        assertFalse(isLeapYear);

    }

    @Test
    public void getDayInYear() {
        DelOpgave8 delOpgave8 = new DelOpgave8();

        LocalDate date  = LocalDate.of ( 2000 , 11 , 6  );

       int day = delOpgave8.calculateDay(date);

       assertEquals(  311 , day);

    }



}