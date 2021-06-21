package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class ClassBasedThread extends Thread {
    @Override
    public void run() {
        super.run();
        // Do work

        for (int i = 0; i < 10; i++) {
            System.out.println("Class Based Thread" + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
