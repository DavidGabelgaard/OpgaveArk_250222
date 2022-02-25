package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave1Test {

    @Test
    public void opgave1() {

    DelOpgave1 delOpgave1 = new DelOpgave1();

    double test = delOpgave1.opgave1(10);

    assertEquals( 4188.8 , test , 0.01 );

    }







}