package training.threads.session2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ashish Patel
 */
public class ThreadSafeExample {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.count);

    }

    static class Counter {
        AtomicInteger count = new AtomicInteger();

        public  void increment() {
            count.incrementAndGet();
        }
    }


}


