package com.fischer.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {


    // Anonymous functions
    // More functional and optimized code
    // Iterate, filter and extract data from collections
    // lambda operator: args -> action
    // Whenever the param is a Functional Interface, you can use lambda

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("Thread 2 running"));

        t1.start();
        t2.start();

        // Another example

        Figure figure1 = new Figure() {
            @Override
            public void draw() {
                System.out.println("Drawing figure 1");
            }
        };

        Figure figure2 = () -> System.out.println("Drawing figure 2");

        figure1.draw();
        figure2.draw();

        // Another example

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("p1", 20.0));
        productList.add(new Product("p2", 45.50));
        productList.add(new Product("p3", 10.0));
        productList.add(new Product("p4", 500.0));
        productList.add(new Product("p5", 350.50));

        productList.forEach((product) -> System.out.println(product.getName() + ": " + product.getPrice()));
        productList.sort((prev, next) -> prev.getPrice().compareTo(next.getPrice()));
        productList.forEach((product) -> System.out.println(product.getName() + ": " + product.getPrice()));
    }

}
