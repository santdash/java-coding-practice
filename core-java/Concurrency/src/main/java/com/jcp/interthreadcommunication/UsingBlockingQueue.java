package com.jcp.interthreadcommunication;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class UsingBlockingQueue {

    public static void main(String[] args) {

        Data data = new Data();
        new Thread(() -> {
            for ( int i = 0; i < 20; i++ ){
                data.getNumber();
                Random random = new Random();
                int sleep = random.ints(1000, 10000).findFirst().getAsInt();
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            for ( int i = 0; i < 20; i++ ){
                Random random = new Random();
                int sleep = random.ints(1000, 10000).findFirst().getAsInt();
                data.addNumber( sleep);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }

    private static class Data {
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(1);

        void getNumber(){
            try {
                System.out.println("Getting a number from queue");
                Integer take = numbers.take();
                System.out.println("Got: " + take);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        void addNumber(Integer s){
            try {
                System.out.println("Adding to queue: " + s);
                numbers.put(s);
                System.out.println("Added to queue: " + s);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
