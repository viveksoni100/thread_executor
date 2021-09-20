package training.logging;

import training.report.Report;

import java.util.logging.Logger;

/**
 * @author Ashish Patel
 */
public class LoggingExample {


    //static final Logger logger = Logger.getLogger(LoggingExample.class);

    public static void main(String[] args) {
//        basicLogger();
//        propertyFileConfigure();
        xmlConfiguration();
        printLogs();
        printLogsFromReport();


    }

    static void printLogs() {
        /*logger.debug("Sample debug Msg");
        logger.info("Sample info Msg");
        logger.warn("Sample warn Msg");
        logger.error("Sample error Msg");
        logger.fatal("Sample fatal Msg");*/
    }

    static void basicLogger() {
        /*BasicConfigurator.configure();*/
    }

    static void propertyFileConfigure() {
//        PropertyConfigurator.configure("log4j.properties");
    }

    static void xmlConfiguration() {
//        DOMConfigurator.configure("log4j.xml");
    }

    private static void printLogsFromReport() {
        Report report = new Report();
        report.printReport();
    }


}
