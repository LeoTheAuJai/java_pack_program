
/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable
{
    protected float area;
    protected float perimeter;
    public Shape()
    {
    }
     // To read the shape information from users
     abstract public void readShape(); 
 
    // To compute the shape’s area
     abstract public double computeArea();
    // To computer the shape’s perimeter 
     abstract public double computePerimeter(); 
    // To display the area and perimeter of the shape
     abstract public void displayShape(); 
     abstract public String displayName();
}
