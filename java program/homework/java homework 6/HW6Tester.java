
/**
 * Write a description of class HW6Tester here.
 *
 * Au Sai Chun (21105253D)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HW6Tester extends JFrame
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class HW6Tester
     */
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;  
    JButton b1;
    public HW6Tester()
    {
        tf1=new JTextField(16);
        tf2=new JTextField(16);
        tf3=new JTextField(16);
        tf4=new JTextField(16);
        tf5=new JTextField(16);
        tf6=new JTextField(16);
        b1 = new JButton("Get Result");
        setLayout(new GridLayout(7, 2, 0, 0));
        add(new JLabel("Choose shape: 'c', 's' or 'r': "));
        add(tf1);
        add(new JLabel("Input the radius of the Circle: "));
        add(tf2);
        add(new JLabel("Input the length of the rectangle or square: "));
        add(tf3);
        add(new JLabel("Input the width of rectangle: "));
        add(tf4);
        add(new JLabel("Area: "));
        add(tf5);
        add(new JLabel("Perimeter: "));
        add(tf6);
        add(b1);
        b1.addActionListener(new Listener());
    }
    class Listener implements ActionListener 
{
    public void actionPerformed(ActionEvent e) 
    {
        //System.out.println(new java.util.Date(e.getWhen()));
        Shape polygon;
        String opt = tf1.getText();
        double area;
        double perimeter;
        if (e.getSource() == b1)
        {
            if((opt.equals("c"))||(opt.equals("s"))||(opt.equals("r"))||(opt.equals("x")))
            {
                
                //shape_opt=test.charAt(0);
                if((opt.equals("c")))
                {
                    float radius = Float.parseFloat(tf2.getText());
                    polygon=new Circle(radius);
                    //polygon.readShape();
                    tf5.setText(Double.toString(polygon.computeArea()));
                    tf6.setText(Double.toString(polygon.computePerimeter()));
                    //polygon.displayShape();
                    polygon.draw();
                }
                if((opt.equals("s")))
                {
                    float length = Float.parseFloat(tf3.getText());
                    polygon=new Square(length);
                    //polygon.readShape();
                    tf5.setText(Double.toString(polygon.computeArea()));
                    tf6.setText(Double.toString(polygon.computePerimeter()));
                    //polygon.displayShape();
                    polygon.draw();
                }
                if((opt.equals("r")))
                {
                    float length = Float.parseFloat(tf3.getText());
                    float width = Float.parseFloat(tf4.getText());
                    polygon=new Rectangle(length, width);
                    //polygon.readShape();
                    tf5.setText(Double.toString(polygon.computeArea()));
                    tf6.setText(Double.toString(polygon.computePerimeter()));
                    //polygon.displayShape();
                    polygon.draw();
                }
                if((opt.equals("x")))
                {
                    //System.out.println("This is the end of the program");
                }
            }
            //repaint();
        }
    }
}
    
    public static void main()
    {
        HW6Tester frame = new HW6Tester();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    

}
