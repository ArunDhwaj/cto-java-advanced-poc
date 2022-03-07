package src.threadssynchronization;

public class TaskRemainder implements Runnable {

    private int max;
    private PrinterScale print;
    private int remainder;

    public TaskRemainder(PrinterScale print, int max, int remainder)
    {
//        System.out.println("1. TaskRemainder");
        this.print = print;
        this.max = max;
        this.remainder = remainder;
    }

    @Override
    public void run() {

        int num = remainder;

        while (num <= max)
        {
            if (remainder == 1)
            {
                print.printRemainder1(num);
            }
            else if (remainder == 2)
            {
                print.printRemainder2(num);
            }
            else if (remainder == 3)
            {
                print.printRemainder3(num);
            }
            else if (remainder == 4)
            {
                print.printRemainder4(num);
            }

            num = num + 4;
        }
    }
}

