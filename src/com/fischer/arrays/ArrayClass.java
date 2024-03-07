package com.fischer.arrays;

import java.util.Arrays;

public class ArrayClass {
    int[] intArray = new int[10]; // fixed size
    int[] intArrayTwo = new int[]{1, 2, 3, 4, 5}; // initializer

    int[] array = {1, 2, 3, 4, 5};


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

        printText("World"); // Wrong
        printText2("Worlds"); // Not wrong

        String[] texts = "Hello world".split(" ");

        printText(texts);
        printText2(texts);
    }

    void printText(String[] texts) {
        for (String s: texts) {
            System.out.println(s);
        }
    }

    void printText2(String... texts) {
        for (String s: texts) {
            System.out.println(s);
        }
    }
}
