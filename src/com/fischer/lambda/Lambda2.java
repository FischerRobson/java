package com.fischer.lambda;

public class Lambda2 {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        this.printThing(myCat);

        // Or

        this.printThing(() -> {
            System.out.println("Au au");
        });

        Printable printable = () -> System.out.println("How How");

        this.printThing(printable);
    }

    public void printThing(Printable printable) {
        printable.print();
    }

}
