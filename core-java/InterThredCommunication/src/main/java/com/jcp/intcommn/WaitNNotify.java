package com.jcp.intcommn;

public class WaitNNotify {

    /** Remove thread is made slow.
     * Demonstrates that fill bucket threads wait until remove thread removes the bucket value.
     * Also, the output proves, though th next fill thread has the lock, it gives up the lock for remove thread.
     */
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for ( int i = 0; i <= 5; i++ ){
                try {
                    data.fillBucket(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "FillBucket Thread").start();

        new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                try {
                    data.remove();
                    Thread.sleep(5000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "RemoveThread").start();
    }

    private static class Data {
        private Integer bucket;
        private boolean bucketFull = false;


        /** fillBucket should wait until the bucket is empty.
           Important Note: While fillBucket  has object lock, wait() helps to release the lock so that other thread
           acquires the lock for remove.
           notify() -- wakes of a waiting thread
           notifyAll() - wakes up all waiting threads.
         */
        public synchronized void fillBucket(int number) throws InterruptedException {
            while ( bucketFull ) {
                System.out.println("Waiting to fill the bucket with :" + number);
                wait();
            }
            this.bucket = number;
            System.out.println("Filling bucket with " + bucket);
            bucketFull = true;
            notifyAll();
        }

        /** Remove should wait until bucket is filled
        * Similar explanation of fillBucket applies here*/
        public synchronized void remove() throws InterruptedException {
            while ( ! bucketFull ){
                System.out.println("Bucket is empty, waiting for it to fill");
                wait();
            }
            System.out.println("Removing bucket value:" + bucket);
            bucket = null;
            bucketFull = false;
            notifyAll();
        }
    }
}
