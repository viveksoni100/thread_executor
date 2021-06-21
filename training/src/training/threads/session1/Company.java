package training.threads.session1;

/**
 * @author Ashish Patel
 */
public class Company {


    int doses;
    boolean produced = false;


    synchronized public void produceDose(int doses) {

        if (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.doses = doses;
        System.out.println("Dose created: " + this.doses);
        produced = true;
        notify();

    }

    synchronized public int consumeDose() {

        if (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Doses consumed: " + this.doses);
        produced = false;
        notify();
        return this.doses;


    }
}
