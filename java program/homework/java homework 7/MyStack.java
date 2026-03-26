
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)Au Sai Chun(21105253D)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MyStack<E>
{
    /**
     * Constructor for objects of class MyStack
     */
    private ArrayList<E> list = new ArrayList<E>();
    public MyStack()
    {
        
    }
    @Override
    public String toString() 
    {
        return "stack: " + list.toString();
    }
    public int getSize()
    {
        return list.size();
    }
    public E peek()
    {
        E result = list.get(0);
        return result;
    }
    public E pop()
    {
        E result = list.get(getSize()-1);
        list.remove(getSize()-1);
        return result;
    }
    public void push(E a)
    {
        list.add(a);
    }
    public boolean isEmpty()
    {
       return(list.isEmpty());
    }
}
