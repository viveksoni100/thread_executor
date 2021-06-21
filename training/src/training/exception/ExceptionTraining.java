package training.exception;

import java.util.logging.Logger;

/**
 * @author Ashish Patel
 */
public class ExceptionTraining {


    private static final Logger logger = Logger.getLogger(String.valueOf(ExceptionTraining.class));

    public static void main(String[] args) {
        System.out.println("First Line");

        try {
            printVariable();
        } catch (InvalidAge e) {
            logger.warning(e.getMessage());
        }


        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            logger.warning(e.getMessage());
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
        System.out.println("Last Line");

    }

    static void printVariable() throws InvalidAge {
        int a = 201;

        if (a > 200) {
            throw new InvalidAge("Age is above limit");
        }
    }


}

class InvalidAge extends Exception {
    InvalidAge() {
        super();
    }

    InvalidAge(String s) {
        super(s);
    }

}