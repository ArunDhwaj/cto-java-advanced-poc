package src.multithreads;

public class Printer {

    private volatile boolean isOdd;

    synchronized void printEven(int num)
    {
//        System.out.println("1. Printer: printEven");

        while(!isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int num)
    {
//        System.out.println("2. Printer: printOdd");

        while(isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + num);
        isOdd = true;
        notify();
    }
}
