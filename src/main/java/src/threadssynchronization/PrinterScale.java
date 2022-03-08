package src.threadssynchronization;
import java.util.concurrent.Semaphore;

public class PrinterScale{

    private Semaphore semRemainder1 = new Semaphore(1);
    private Semaphore semRemainder2 = new Semaphore(0);
    private Semaphore semRemainder3 = new Semaphore(0);
    private Semaphore semRemainder4 = new Semaphore(0);

    private Semaphore semRemainder4r = new Semaphore(1);
    private Semaphore semRemainder3r = new Semaphore(0);
    private Semaphore semRemainder2r = new Semaphore(0);
    private Semaphore semRemainder1r = new Semaphore(0);

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

    void printRemainder4Rev(int num)
    {
        try
        {
            semRemainder4r.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder3r.release();
    }

    void printRemainder3Rev(int num)
    {
        try
        {
            semRemainder3r.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder2r.release();
    }

    void printRemainder2Rev(int num)
    {
        try
        {
            semRemainder2r.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder1r.release();
    }
    void printRemainder1Rev(int num)
    {
        try
        {
            semRemainder1r.acquire();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        semRemainder4r.release();
    }

}
