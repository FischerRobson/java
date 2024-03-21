package com.fischer.generics;

import java.util.Random;

public class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        this.id = LAST_ID++;
        this.gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
