
/**
 * Write a description of class HW6Tester here.
 *
 * @author (your name)
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
    JButton b1,b2;
    public HW6Tester()
    {
        tf1=new JTextField(16);
        tf2=new JTextField(16);
        tf3=new JTextField(16);
        tf4=new JTextField(16);
        tf5=new JTextField(16);
        tf6=new JTextField(16);
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
        add(new JButton("Get Result"));
        
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
