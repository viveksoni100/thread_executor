package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class InterfaceBasedThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Start " + Thread.currentThread().getName());
        for (int i = 10; i >= 1; i--) {
            System.out.println("Interface Based Thread" + i);


        }

        System.out.println("Thread Ended " + Thread.currentThread().getName());

    }
}
