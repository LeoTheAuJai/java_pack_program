
/**
 * Name: Au Sai Chun
 * Student ID: 21105253D
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String courseName;
    private int testMarks;

    /**
     * Constructor for objects of class Course
     */
    public Course(String a, int b)
    {
        courseName=a;
        testMarks=b;
    }
    public void displaycourse()
    {
        System.out.println(courseName+", "+Integer.toString(testMarks));
        
    }

   
}
