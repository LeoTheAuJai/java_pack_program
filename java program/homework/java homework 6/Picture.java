/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;
import java.util.Iterator;

public class Picture
{
    private List shapes;
    public Picture()
    {
        shapes = new ArrayList();
    }
    public void addShape(Shape s)
    {
        shapes.add(s);
    }
    public void computeShape()
    {
        
        Shape a = new Circle(0);
        for (Iterator iter = shapes.iterator(); iter.hasNext();)
        {
            a = (Shape)iter.next();
            a.computeArea();
            a.computePerimeter();
        }
    }
      public void listAllShapeTypes()
     {
        Shape a = new Circle(0);
        for (Iterator iter = shapes.iterator(); iter.hasNext();)
        {
            a = (Shape)iter.next();
            a.displayShape();
     }
     }
     public void listSingleShapeType(String className)
     {
        Shape a = new Circle(0);
        for (Iterator iter = shapes.iterator(); iter.hasNext();)
        {
            a = (Shape)iter.next();
            if(a.displayName()==className)
            {
                a.displayShape();
            }
        }
     }
    }

