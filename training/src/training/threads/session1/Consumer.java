package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class Consumer extends Thread {

    Company company;
    Consumer(Company company)
    {
        this.company = company;
    }
    @Override
    public void run() {
        super.run();

        while (true)
        {
            this.company.consumeDose();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
