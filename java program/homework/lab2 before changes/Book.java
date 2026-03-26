import java.util.LinkedList;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title; // store the title of the book
    private String ISBN; // store the ISBN of the book
    private boolean available; // keep the status of whether the book is available; 
    // initially should be true
    private MyQueue<String> reservedQueue = new MyQueue<String>(); // store the queue of waiting list
    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        
    }
    public String getTitle()
    {
        return title;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public boolean getAvailable()
    {
        return available;
    }
    public void setTitle(String a)
    {
        title = a;
    }
    public void setISBN(String a)
    {
        ISBN = a;
    }
    public void setAvailable(boolean a)
    {
        available = a;
    }
    public MyQueue<String> getReservedQueue()
    {
        return reservedQueue;
    }
    public boolean isAvailable()
    {
        return available;
    }
}
