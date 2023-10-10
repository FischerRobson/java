package com.fischer;

public class Calculator {

    private static double sum(double n1, double n2) {
        return n1 + n2;
    }

    private static double sub(double n1, double n2) {
        return n1 - n2;
    }

    private static double mult(double n1, double n2) {
        return n1 * n2;
    }

    private static double div(double n1, double n2) {
        return n1 / n2;
    }

    public static void handleOperation(double num1, double num2, int operation) throws Exception {
        switch (operation) {
            case 1:
                System.out.println(Calculator.sum(num1, num2));
                break;
            case 2:
                System.out.println(Calculator.sub(num1, num2));
                break;
            case 3:
                System.out.println(Calculator.mult(num1, num2));
                break;
            case 4:
                System.out.println(Calculator.div(num1, num2));
                break;
            default:
                throw new Exception(new IndexOutOfBoundsException());
        }
    }



}
