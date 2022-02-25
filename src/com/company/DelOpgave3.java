package com.company;

public class DelOpgave3 {

    public int[] amountOfEachDollarBill( int amount  ) {

        int twenties = amount / 20;

        amount %= 20;

        int tens = amount / 10;

        amount %=  10;

        int fives = amount / 5;

        amount %= 5;

        int[] array  = new int[4];

        array[0] = twenties;
        array[1] = tens;
        array[2] = fives;
        array[3] = amount;

        return array;

    }






}
