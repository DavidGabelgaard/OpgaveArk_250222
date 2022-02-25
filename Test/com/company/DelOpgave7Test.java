package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelOpgave7Test {

    @Test
    public void testSwitchCalculateGradeFromInt() {

        DelOpgave7 delOpgave7 = new DelOpgave7();

        String grade = delOpgave7.switchCalculateGradeFromInt(43);

        assertEquals("F" , grade);

    }

    @Test
    public void testCalculateGradeFromInt() {
        DelOpgave7 delOpgave7 = new DelOpgave7();

        String grade = delOpgave7.calculateGradeFromInt(54);

        assertEquals("F" , grade);

    }

}