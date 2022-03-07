package src.threadssynchronization;

public class PrintRemainder {

    public void printRemainder()
    {
//        System.out.println("1: PrintRemainder");
        PrinterScale print = new PrinterScale();

        Thread t1 = new Thread(new TaskRemainder(print, 40, 1), "Remainder1");
        Thread t2 = new Thread(new TaskRemainder(print, 40, 2), "Remainder2");
        Thread t3 = new Thread(new TaskRemainder(print, 40, 3), "Remainder3");
        Thread t4 = new Thread(new TaskRemainder(print, 40, 4), "Remainder0");

//        System.out.println("2: PrintRemainder");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
//        System.out.println("3: PrintRemainder");
    }
}
