package com.fischer;

import com.fischer.arrays.ArrayChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int[] intArray = new int[10]; // fixed size
        //int[] intArrayTwo = new int[]{1, 2, 3, 4, 5}; // initializer

        //for (int element : intArray) {
        //    System.out.println(element);
        //}

        ArrayChallenge arrayChallenge = new ArrayChallenge();
        int[] array = arrayChallenge.generateRandomArray(5);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayChallenge.reverseSortArray(array)));
    }
}
