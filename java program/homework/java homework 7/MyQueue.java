
/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)Au Sai Chun(21105253D)
 * @version (a version number or a date)
 */

import java.util.LinkedList;

public class MyQueue<E>
{
    /**
     * Constructor for objects of class MyQueue
     */
    private LinkedList<E> list = new LinkedList<E>();
    public MyQueue()
    {
        
    }
    @Override
    public String toString() 
    {
        return "Queue: " + list.toString();
    }
    public void enqueue(E a)
    {
        list.addLast(a);
    }
    public E dequeue()
    {
        E result = list.getFirst();
        list.removeFirst();
        return result;
    }
    public int getSize()
    {
        return list.size();
    }
    
}
