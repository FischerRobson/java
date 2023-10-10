package com.fischer;

import com.fischer.arrays.ArrayChallenge;
import com.fischer.lambda.Figure;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        //int[] intArray = new int[10]; // fixed size
        //int[] intArrayTwo = new int[]{1, 2, 3, 4, 5}; // initializer

        //for (int element : intArray) {
        //    System.out.println(element);
        //}

//        ArrayChallenge arrayChallenge = new ArrayChallenge();
//        int[] array = arrayChallenge.generateRandomArray(5);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arrayChallenge.reverseSortArray(array)));

        Figure figure1 = new Figure() {
            @Override
            public void draw() {
                System.out.println("Drawing figure 1");
            }
        };

        figure1.draw();

        Figure figure2 = () -> System.out.println("Drawing figure 2");
        figure2.draw();
    }
}
