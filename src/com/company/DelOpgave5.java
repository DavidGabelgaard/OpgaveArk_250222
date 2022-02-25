package com.company;

import java.util.Scanner;

public class DelOpgave5 {


    public void returnSmallestAndLargest() {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println( returnSmallest(array));
        System.out.println( returnLargest(array));


    }



    public int returnSmallest( int[] array   ) {

        int smallest = array[0];

        for (int i = 1; i < 4; i++) {

            if (  array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public int  returnLargest (int[] array) {
        int largest = array[0];

        for (int i = 0; i < 4; i++) {
            if ( array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;

    }











}
