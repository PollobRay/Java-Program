public class Container<T>
{
    private static final int MAX_LENGTH=10;
    private T[] items;
    private int currentIndex=0;

    public Container()
    {
        items=(T[]) new Object[MAX_LENGTH];
    }

    public void addItem(T item)
    {
        if(currentIndex<MAX_LENGTH)
        {
            items[currentIndex++]=item;
        }
        else
        System.out.println("Container is full");
    }

    public T getItem(int index)
    {
        if(index>MAX_LENGTH)
        {
            throw new IllegalArgumentException("Index Full");
        }
        return items[index];
    }

    public void printAll()
    {
        for(Integer i: items)
        {
            System.out.println(i);
        }
    }

    public static void main(String ar[])
    {
        Container<Integer> container=new Container<> ();
        container.addItem(1);
        container.addItem(2);
        container.printAll();
    }
}