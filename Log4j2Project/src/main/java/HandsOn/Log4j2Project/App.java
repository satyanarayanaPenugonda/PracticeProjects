package HandsOn.Log4j2Project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello Satya!" );
        logger.error("This is my first error logged ");
        logger.error("This is my first error logged 2 ");
        logger.error("This is my first error logged 3 test ");
        logger.error("This is my first error logged 4 ");
        logger.error("This is my first error logged 5 ");
        logger.error("This is my first error logged 6 test");
        logger.error("This is my first error logged 7 ");
        logger.error("This is my first error logged 8 ");
        logger.error("This is my first error logged 9 test ");
        logger.error("This is my first error logged 10 ");
        logger.error("This is my first error logged 11 ");
        logger.info("This is my first info logged ");
        logger.info("This is my first info logged 2");
        logger.info("This is my first info logged 3 test ");
        logger.info("This is my first info logged 4");
        logger.info("This is my first info logged 5");
        logger.info("This is my first info logged 6 test ");
        logger.info("This is my first info logged 7");
        logger.info("This is my first info logged 8");
        logger.info("This is my first info logged 9 test ");
        logger.info("This is my first info logged 10");
        logger.info("This is my first info logged 11");
        logger.debug("This is my first debug logged ");
        logger.debug("This is my first debug logged 1 ");
        logger.debug("This is my first debug logged 2 ");
        logger.debug("This is my first debug logged 3 test ");
        logger.debug("This is my first debug logged 4 ");
        logger.debug("This is my first debug logged 5 ");
        logger.debug("This is my first debug logged 6 test ");
        logger.debug("This is my first debug logged 7 ");
        logger.debug("This is my first debug logged 8 ");
        logger.debug("This is my first debug logged 9  test ");
        logger.debug("This is my first debug logged 10 ");
        logger.debug("This is my first debug logged 11 ");
        logger.fatal("This is for testing ");
        logger.warn("This is for testing 2");
    }
}
