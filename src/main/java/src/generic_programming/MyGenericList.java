package src.generic_programming;

public class MyGenericList <T> implements IList<T>
{
    private T[] datasource;
    private int size;
    private int pos;

    public MyGenericList (int numElements)
    {
        size = numElements;
        pos = 0;
        datasource = ( T[] ) new Object[size];
    }

    public void add(T element)
    {
        datasource[pos] = element;
        ++pos;
    }

    public T get(int pos)
    {
        return datasource[pos];
    }

    public String toString()
    {
        String elements = "";

        for (int i = 0; i< pos; i++ )
        {
            elements += datasource[i] + " ";
        }
        return elements;
    }
}
