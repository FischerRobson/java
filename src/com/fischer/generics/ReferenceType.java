package com.fischer.generics;

import java.util.ArrayList;
import java.util.List;

public class ReferenceType {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<LPAStudent> lpaStudents = new ArrayList<>();

        printList(studentList);
        printList(lpaStudents);
    }

//      impossible to print LPAStudents List
    public static void printList(List<Student> list) {
        for (Student e : list) {
            System.out.println(e.toString());
        }
        System.out.println();
    }

    public static <T extends Student> void printList(List<T> students) {
        for (Student e : students) {
            System.out.println(e.toString());
        }
        System.out.println();
    }

    public static void printList(List<? extends Student> students) {
        for (Student e : students) {
            System.out.println(e.toString());
        }
        System.out.println();
    }

    class Student {

    }

    class LPAStudent extends Student {

    }

}
