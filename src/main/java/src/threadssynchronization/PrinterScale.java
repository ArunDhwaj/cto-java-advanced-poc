package src.threadssynchronization;
import java.util.concurrent.Semaphore;

public class PrinterScale{

    private Semaphore semRemainder1 = new Semaphore(1);
    private Semaphore semRemainder2 = new Semaphore(0);
    private Semaphore semRemainder3 = new Semaphore(0);
    private Semaphore semRemainder4 = new Semaphore(0);

    void printRemainder1(int num)
    {
        try
        {
            semRemainder1.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder2.release();
    }

    void printRemainder2(int num)
    {
//        System.out.println("printRemainder2: " + num);
        try
        {
            semRemainder2.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder3.release();
    }

    void printRemainder3(int num)
    {
//        System.out.println("printRemainder3: " + num);

        try
        {
            semRemainder3.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder4.release();
    }

    void printRemainder4(int num)
    {
//        System.out.println("printRemainder4: " + num);

        try
        {
            semRemainder4.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder1.release();
    }

}
