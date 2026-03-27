/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.awt.*;
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable 
{
    private float length;
    private float width;
    private float area;
    private float perimeter;
    private String name="Rectangle";
    public Rectangle(float a, float b)
    {
        length = a;
        width = b;
    }
    public void readShape()
    {
        System.out.println("Please input the length: ");
        Scanner input = new Scanner(System.in);
        length = input.nextFloat();
        System.out.println("Please input the width: ");
        Scanner input2 = new Scanner(System.in);
        width = input2.nextFloat();
    }
    public double computeArea()
    {
        area=length*width;
        return area;
    }
    public double computePerimeter()
    {
        perimeter=(length+width)*2;
        return perimeter;
    }
    public void displayShape()
    {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
    public String displayName()
    {
        return name;
    }
    public void draw()
    {
        Canvas canvas=Canvas.getCanvas();
        canvas.draw (this,"blue",new java.awt.geom.Rectangle2D.Float(200,200,length,width));
    }
}
