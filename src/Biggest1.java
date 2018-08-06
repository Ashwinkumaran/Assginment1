import java.util.*;
public class Biggest1 
{
	 public static void main(String[] args) 
	 {
         int n,a,b,c;
		   
		    
		    System.out.println("Please enter value of N: ");

		    Scanner s = new Scanner(System.in);
		    n = s.nextInt();
		    a = Integer.MIN_VALUE;
		    b = Integer.MAX_VALUE;
		    System.out.println("Enter the "+n );
		    for (int i = 0; i < n; i++) 
		    {

		      c = s.nextInt();
		      if (c > a) {
		        a = c;
		      } 
		      if (c< b) {
		        b = c;

		      }
		    }

		    System.out.println("largest of N number is : " +a);
		    System.out.println("smallest of N number is : " +b);
		  }


}
