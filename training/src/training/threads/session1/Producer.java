package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class Producer extends Thread {

    Company company;
    Producer(Company company)
    {
        this.company = company;
    }
    @Override
    public void run() {
        super.run();

        int dose = 1;
        while (true)
        {
            this.company.produceDose(dose);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dose++;
        }

    }
}
