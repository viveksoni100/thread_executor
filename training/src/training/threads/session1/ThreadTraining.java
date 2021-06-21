package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class ThreadTraining {
    public static void main(String[] args) {
        System.out.println("Main Method Starts: " +getCurrentThreadName());
        Company company = new Company();
        startProduce(company);
        startConsume(company);
        System.out.println("Main Method Ends");
    }

    private static void startClassBasedThread() {
        ClassBasedThread classBasedThread = new ClassBasedThread();
        classBasedThread.start();
    }

    private static void startInterFaceBasedThread() {
        InterfaceBasedThread interfaceBasedThread = new InterfaceBasedThread();
        Thread thread = new Thread(interfaceBasedThread);
        thread.start();

    }

    private static String getCurrentThreadName() {
        String threadName = "";
        return Thread.currentThread().getName();
    }

    private static void startProduce(Company company) {
        Producer producer = new Producer(company);
        producer.start();

    }

    private static void startConsume(Company company) {
        Consumer consumer = new Consumer(company);
        consumer.start();

    }


}
