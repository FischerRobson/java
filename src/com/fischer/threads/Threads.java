package com.fischer.threads;

public class Threads {

    public static void main(String[] args) {
        Multithread th1 = new Multithread(1);
        Multithread th2 = new Multithread(2);

        th1.start();
        th2.start();

        // th1.join();  await other thread
        // th1.isAlive();  return a boolean if thread is running
    }

}
