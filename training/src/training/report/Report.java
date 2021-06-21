package training.report;

import org.apache.log4j.Logger;

/**
 * @author Ashish Patel
 */
public class Report {

    static final Logger logger = Logger.getLogger(Report.class);

    public static void printReport()
    {
        logger.debug("Sample debug Msg");
        logger.info("Sample info Msg");
        logger.warn("Sample warn Msg");
        logger.error("Sample error Msg");
        logger.fatal("Sample fatal Msg");
    }

}
