/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
import java.util.Scanner;
/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Circle extends Shape implements Drawable
{
    private float radius;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private double area;
    private double perimeter;
    private String name="Circle";
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle(float a)
    {
        radius = a;
    }
    public void readShape()
    {
        System.out.println("Please input the radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();
    }
    public double computeArea()
    {
        area=(Math.PI)*radius*radius;
        return area;
    }
    public double computePerimeter()
    {
        perimeter=(Math.PI)*radius*2;
        return perimeter;
    }
    
    public String displayName()
    {
        return name;
    }
    public void displayShape()
    {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
     public void draw()
    {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw (this,"blue",new java.awt.geom.Ellipse2D.Float(1,1,radius,radius));
    }
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    /*
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    /*
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    /*
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    /*
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the circle a few pixels up.
     */
    /*
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    /*
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    /*
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    /*
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    /*
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    /*
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    /*
    public void changeSize(float newRadius)
    {
        erase();
        radius = newRadius;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    /*
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /*
     * Draw the circle with current specifications on screen.
     */
    /*
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    /*
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    */
}
