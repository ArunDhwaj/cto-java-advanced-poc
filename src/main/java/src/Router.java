package src;

import src.generic_programming.MyGenericList;
import src.generic_programming.Node;
import src.generic_programming.Pair;
import src.java_optimization.threading.ThreadCreation;
import src.multithreads.PrintEvenOdd;
import src.threadssynchronization.PrintRemainder;

public class Router {

    //Routes to different modules
    public void routesTo()
    {
        //Uncomment any routes you want to run

        // printEvenOdd();

//        printRemainder();

//        testGeneric1();

//        testGeneric2();

//        testGeneric3();

          testGeneric4();

          threadCreation();

    }

    //Topic-1.1: Java-advanced: Threads Synchronization: Using Mutex
    private void printEvenOdd() {
        PrintEvenOdd p = new PrintEvenOdd();
        p.printEvenOdd();
    }

    //Topic-1.2: Java-advanced: Threads synchronisation: Using Semaphore
    private void printRemainder()
    {
        PrintRemainder pr = new PrintRemainder();
        pr.printRemainder();
    }

    //Topic-2.1: Java-advanced: Generic Programming: MyGenericList<Integer>
    private void testGeneric1()
    {
        MyGenericList<Integer> intList = new MyGenericList<Integer>(3);
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("List of Integer: " + intList.toString());
    }

    //Topic-2.2: Java-advanced: Generic Programming: MyGenericList<String>
    private void testGeneric2()
    {
        MyGenericList<String> strings = new MyGenericList<String>(3);
        strings.add("A");
        strings.add("B");
        strings.add("C");
        System.out.println("List of Integer: " + strings.toString());
    }

    //Topic-2.3: Java-advanced: Generic Programming: Pair<String, Integer>
    private void testGeneric3()
    {
        Pair<String, Integer> grade1 = new Pair<String, Integer>("Aarush", 8);
        System.out.println(grade1.first());
        System.out.println(grade1.second());
    }

    //Topic-2.4: Java-advanced: Generic Programming: Node
    private void testGeneric4()
    {
        Node<String> n1 = new Node<String>("Aarush");
        Node<String> n2 = new Node<String>("Aarul");
        Node<String> n3 = new Node<String>("SBP");
        Node<String> n4 = new Node<String>("Footer");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node<String> dummy = n1;

        while (dummy.next != null) {
            System.out.println(dummy.getData());
            dummy = dummy.next;
        }
        System.out.println(dummy.getData());
    }

    public void threadCreation()
    {
        ThreadCreation threadCreation = new ThreadCreation();
        threadCreation.ThreadCreation();
    }
}
