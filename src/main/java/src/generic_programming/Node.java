package src.generic_programming;

public class Node <T> {

    private T data;
    public Node next;

    public Node (T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return data;
    }

}
