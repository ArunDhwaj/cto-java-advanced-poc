package src.multithreads;

public class PrintEvenOdd {

    public void printEvenOdd()
    {
//        System.out.println("1: printEvenOdd");
        Printer print = new Printer();

        Thread t1 = new Thread(new src.multithreads.TaskEvenOdd(print, 20, false), "Odd");
        Thread t2 = new Thread(new src.multithreads.TaskEvenOdd(print, 20, true), "Even");

//        System.out.println("2: printEvenOdd");
        t1.start();
        t2.start();

//        System.out.println("3: printEvenOdd");
    }
}
