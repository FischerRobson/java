package com.fischer.generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students)); // dont work without comparable

        Comparator<Student> comparator = new StudentGPAComparator();
        Arrays.sort(students, comparator);
        System.out.println(Arrays.toString(students));

//        tim.compareTo("Mary");
    }
}

record BaseballPlayer(String name, String position) implements Player {}