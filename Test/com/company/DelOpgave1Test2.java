package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave1Test2 {

    @Test
    public void testAddTax() {

        DelOpgave1 delOpgave1 = new DelOpgave1();

        double test = delOpgave1.addTax(100);

        assertEquals(105 , test , 0.00000000001);

    }
}