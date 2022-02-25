package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave4Test {

    @Test
    public void testHowManyDigits() {

        DelOpgave4 delOpgave4 = new DelOpgave4();

        int digits =  delOpgave4.howManyDigits(1276124);

        assertEquals(digits , 7);

    }
}