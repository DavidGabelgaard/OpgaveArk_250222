package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave3Test {

    @Test
    public void testAmountOfEachDollarBill() {

        DelOpgave3 delOpgave3 = new DelOpgave3();

        int[] test = delOpgave3.amountOfEachDollarBill(93);

        int[] expected =  { 4 , 1 , 0 , 3      };

        for (int i = 0; i < 4; i++) {
            assertEquals(expected[i]  , test [i]);
        }

    }
}