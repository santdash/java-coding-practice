package com.jdrd.itc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** Same behavior of Wait Notify/NotifyAll but with ReentrantLock and Condition.
 * But it provides more control to wake of the threads waiting for particular condition.
 */
public class ReentrantLock_WaitNotifyAlternative {

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

        final Lock lock = new ReentrantLock();
        Condition bucketFullCondition = lock.newCondition();
        Condition bucketEmptyCondition = lock.newCondition();


        public  void fillBucket(int number) throws InterruptedException {
            lock.lock();
            while ( bucketFull ) {
                System.out.println("Waiting to fill the bucket with :" + number);
                bucketEmptyCondition.await();
            }
            this.bucket = number;
            System.out.println("Filling bucket with " + bucket);
            bucketFull = true;
            bucketFullCondition.signal();
            lock.unlock();
        }

        /** Remove should wait until bucket is filled
         * Similar explanation of fillBucket applies here*/
        public void remove() throws InterruptedException {
            lock.lock();
            while ( ! bucketFull ){
                System.out.println("Bucket is empty, waiting for it to fill");
                bucketFullCondition.await();
            }
            System.out.println("Removing bucket value:" + bucket);
            bucket = null;
            bucketFull = false;
            bucketEmptyCondition.signal();
            lock.unlock();
        }
    }
}
