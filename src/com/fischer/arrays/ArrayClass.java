package com.fischer.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {
    int[] intArray = new int[10]; // fixed size
    int[] intArrayTwo = new int[]{1, 2, 3, 4, 5}; // initializer

    void myFunc() {
        System.out.println(intArray[0]); // first element
        System.out.println(intArray[intArray.length - 1]); // last element

        for (int element : intArray) { // for each
            System.out.println(element);
        }

        System.out.println(Arrays.toString(intArray)); // print all elements

        Object objectVariable = intArray; // casting array to object
        Object[] objectArray = new Object[3]; // initializer as object

        Arrays.sort(intArray); // sort array
        Arrays.fill(intArray, 5); // fill all positions with the value

        int[] newArray = new int[10];
        int[] otherArray = Arrays.copyOf(newArray, newArray.length); // copies by value, not references
    }
}
