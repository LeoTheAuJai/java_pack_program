
/**
* Name: Au Sai Chun    
 * 21105253D
 */
import java.util.Scanner;
public class first_class
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class first_class
     */

public static void main(String[] args)
{ 
    System.out.print("Enter the number of lines: ");
    Scanner input = new Scanner(System.in);
    int d = input.nextInt();
    int i=1;
    int mid=0;
    String blank=" ";
    while(i<=d)
    {
        for(int I=i;I!=d;I++)
        {
            blank=blank+"     ";
        }
        System.out.print(blank+i);
        
        if(i>1)
        {
            mid=i;
            while(mid>1)
            {
                mid--;
                if((1+mid)>=10)
                {
                    System.out.print("   "+mid);
                }
                else
                {
                    System.out.print("    "+mid);
                }
            }
        }
        for(int I=2;I<=i;I++)
        {
            if((1+I)>=10)
            {
                System.out.print("   "+I);
            }
            else
            {
                System.out.print("    "+I);
            }
        }
        System.out.print("\n");
        i++;
        blank=" ";
    }
}

}
