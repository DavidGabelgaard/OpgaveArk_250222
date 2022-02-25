package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave2Test {

    @Test
    public void TextPolynomial() {

        DelOpgave2 delOpgave2 = new DelOpgave2();

        double test = delOpgave2.polynomial(4);

        assertEquals( 3270 , test , 0.00000000001 );



    }
}