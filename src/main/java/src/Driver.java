package src;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import src.multithreads.PrintEvenOdd;
import src.threadssynchronization.PrintRemainder;

public class Driver {

    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        System.out.println("Java Advanced POC !!!");

        PrintEvenOdd p = new PrintEvenOdd();
//        p.printEvenOdd();

        PrintRemainder pr = new PrintRemainder();
        pr.printRemainder();
    }
}
