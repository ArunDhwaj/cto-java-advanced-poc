package src.generic_programming;

public class Pair <T1, T2>
{
    private T1 firstElement;
    private T2 secondElement;

    public Pair(T1 first, T2 second)
    {
        firstElement = first;
        secondElement = second;
    }

    public T1 first()
    {
        return firstElement;
    }

    public T2 second()
    {
        return secondElement;
    }

}
