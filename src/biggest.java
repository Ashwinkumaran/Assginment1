import java.util.*;
public class biggest 
{
			  public static void main(String[] args) {
			     Scanner in = new Scanner(System.in);
			     System.out.println("Enter first number: ");
			     int n1 = in.nextInt();
			     System.out.println("Enter second number: ");
			     int n2 = in.nextInt();
			     System.out.println("Enter third number: ");
			     int n3 = in.nextInt();
			     int largest = Math.max(n1, Math.max(n2, n3));
			     System.out.println("Largest among (" + n1 + ", " + n2 + ", " + n3 + ") is: " 
			                                    + largest);
			     int smallest = Math.min(n1, Math.min(n2, n3));
			     System.out.println("Smallest among (" + n1 + ", " + n2 + ", " + n3 + ") is: " 
			                                     + smallest);
			     
			  }
		
	}
	

