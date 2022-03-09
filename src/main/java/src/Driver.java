package src;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import src.generic_programming.MyGenericList;
import src.generic_programming.Node;
import src.generic_programming.Pair;
import src.multithreads.PrintEvenOdd;
import src.threadssynchronization.PrintRemainder;


public class Driver {

    private static Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args)
    {
        System.out.println("Java Advanced POC !!!");

        /*
        //Topic-1: Java-advanced: Threads Synchronization: Using Mutex
        PrintEvenOdd p = new PrintEvenOdd();
        p.printEvenOdd();
        */

        /*
        //Topic-2: Java-advanced: Threads synchronisation: Using Semaphore
        PrintRemainder pr = new PrintRemainder();
        pr.printRemainder();
        */


        //Topic-3: Java-advanced: Generic Programming
        MyGenericList<Integer> intList = new MyGenericList<Integer>(3);
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("List of Integer: " + intList.toString());

        MyGenericList<String> strings = new MyGenericList<String>(3);
        strings.add("A");
        strings.add("B");
        strings.add("C");
        System.out.println("List of Integer: " + strings.toString());

        Pair<String, Integer> grade1 = new Pair<String, Integer>("Aarush", 8);
        System.out.println(grade1.first());
        System.out.println(grade1.second());

        Node<String> n1 = new Node<String>("Aarush");
        Node<String> n2 = new Node<String>("Aarul");
        Node<String> n3 = new Node<String>("SBP");
        Node<String> n4 = new Node<String>("Footer");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node<String> dummy = n1;

        while (dummy.next != null)
        {
            System.out.println( dummy.getData());
            dummy = dummy.next;
        }
        System.out.println( dummy.getData());
    }
}
