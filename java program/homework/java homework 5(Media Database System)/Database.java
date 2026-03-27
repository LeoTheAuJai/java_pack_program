import java.util.ArrayList;
import java.util.Iterator;

public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        for(Iterator<Item> iter = items.iterator(); iter.hasNext(); )
        {
            Item item = iter.next();
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    Item searchByTitle(String theTitle)
    {
        for (Iterator<Item> iter = items.iterator(); iter.hasNext();)
        {
            Item a = iter.next();
            if(a.getTitle().equals(theTitle))
            {
                return a;
            }
        }
        return null;
    }
}