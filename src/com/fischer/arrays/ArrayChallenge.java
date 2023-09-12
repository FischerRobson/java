package com.fischer.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public int[] generateRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public int[] reverseSortArray(int[] array) {
        Arrays.sort(array);
        int[] reversed = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(reversed));
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length -1  -i];
        }
        return reversed;
    }



}
