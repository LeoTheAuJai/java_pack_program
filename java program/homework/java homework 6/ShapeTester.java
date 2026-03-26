/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import javax.swing.JLabel;
public class ShapeTester
{
    public ShapeTester()
    {
        Shape designed_shape;
    }

    public static void main()
    {
        
        char shape_opt=' ';
        Scanner input;
        Shape polygon;
        String border=" ";
        String test="";
        while(shape_opt!=('x'))
        {
            
            border="";
            for(int i=0;i<37;i++)
            {
                border=border+"*";
            }
            
            System.out.println(border);
            System.out.println("* Please choose one the followings: *");
            System.out.println("* Press 'c' - Circle                *");
            System.out.println("* Press 's' - Square                *");
            System.out.println("* Press 'r' - Rectangle             *");
            System.out.println("* Press 'x' - EXIT                  *");
            System.out.println(border);
            System.out.println();
            input = new Scanner(System.in);
            shape_opt=input.nextLine().charAt(0);
            if((shape_opt==('c'))||(shape_opt==('s'))||(shape_opt==('r'))||(shape_opt==('x')))
            {
                //shape_opt=test.charAt(0);
                if((shape_opt==('c')))
                {
                    polygon=new Circle(0);
                    polygon.readShape();
                    polygon.computeArea();
                    polygon.computePerimeter();
                    polygon.displayShape();
                    polygon.draw();
                }
                if((shape_opt==('s')))
                {
                    polygon=new Square(0);
                    polygon.readShape();
                    polygon.computeArea();
                    polygon.computePerimeter();
                    polygon.displayShape();
                    polygon.draw();
                }
                if((shape_opt==('r')))
                {
                    polygon=new Rectangle(0,0);
                    polygon.readShape();
                    polygon.computeArea();
                    polygon.computePerimeter();
                    polygon.displayShape();
                    polygon.draw();
                }
                if((shape_opt==('x')))
                {
                    System.out.println("This is the end of the program");
                }
            }
            else
            {
                System.out.println("Invalid Command!");
                System.out.println();
            }
            
        }
    }
}
