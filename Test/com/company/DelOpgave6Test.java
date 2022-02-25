package com.company;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DelOpgave6Test {

    @Test
    public void testReturnFirstDate() {

        DelOpgave6 delOpgave6 = new DelOpgave6();

        LocalDate date1 = LocalDate.of(1997 , 3 , 4);
        LocalDate date2 = LocalDate.of(1999 , 11 , 6);

        LocalDate firstDate =  delOpgave6.returnFirstDate(date1 , date2);

        assertEquals(date1 , firstDate);




    }
}