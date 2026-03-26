
/**
 * Name: Au Sai Chun
 * Student ID: 21105253D
 */
public class UniversityStudent
{
    // instance variables - replace the example below with your own
    private String studentName;
    private int courseNumber;
    private Course[] courseList;

    /**
     * Constructor for objects of class UniversityStudent
     */
    public UniversityStudent(String a, int b,Course[] c)
    {
        studentName=a;
        courseNumber=b;
        courseList=c;
    }
    public void print()
    {
        System.out.println("Student Name: "+studentName);
        for(int i=0;i<courseNumber;i++)
        {
          courseList[i].displaycourse();
        }
    }

    
}
