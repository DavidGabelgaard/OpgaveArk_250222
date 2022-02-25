package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave5Test {

    @Test
    public void TestReturnSmallest() {

        DelOpgave5 delOpgave5 = new DelOpgave5();

        int[] array = {6 , 2 , 7 ,10};

        int smallestTest =  delOpgave5.returnSmallest(array);

        assertEquals(2 , smallestTest);

    }

    @Test
    public void testReturnLargest() {

        DelOpgave5 delOpgave5 = new DelOpgave5();

        int[] array = {6 , 2 , 7 ,10};

        int largestTest =  delOpgave5.returnLargest(array);

        assertEquals(10 , largestTest);

    }
}