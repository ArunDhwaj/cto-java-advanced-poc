package src;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Driver {

    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        System.out.println("Java Advanced POC !!!");

        //Calling Router
        Router router = new Router();
        router.routesTo();
    }
}
