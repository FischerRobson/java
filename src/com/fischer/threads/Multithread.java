package com.fischer.threads;

// Or implements Runnable interface
public class Multithread extends Thread{
    private int threadNumber;

    public Multithread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " from thread: " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
