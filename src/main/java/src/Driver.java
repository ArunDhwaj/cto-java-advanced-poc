package src;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Driver {

    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        System.out.println("Hello World !!!");
        logger.debug("Hello World !!!");
        logger.debug("Debugging log message");
        logger.info("Info log message");
//        logger.error("Error log message");
    }
}
