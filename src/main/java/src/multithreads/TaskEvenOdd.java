package src.multithreads;

public class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;


    public TaskEvenOdd(Printer print, int max, boolean isEvenNumber)
    {
//        System.out.println("1. TaskEvenOdd");
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

//        System.out.println("2. TaskEvenOdd");

        int num = isEvenNumber ? 2 : 1;
        while (num <= max) {
            if (isEvenNumber) {
                print.printEven(num);
            } else {
                print.printOdd(num);
            }

            num = num + 2;
        }
    }
}

