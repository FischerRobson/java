package com.fischer.collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(1);

        numbers.remove(1);

        System.out.println(numbers.contains(13));
    }

}
