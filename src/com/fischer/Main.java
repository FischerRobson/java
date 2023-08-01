package com.fischer;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = new int[10]; // fixed size
        int[] intArrayTwo = new int[]{1, 2, 3, 4, 5}; // initializer

        for (int element : intArray) {
            System.out.println(element);
        }
    }
}
