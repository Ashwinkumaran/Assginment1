import java.util.*;
public class Prime 
{
	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       String  str = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int c=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		c = c + 1;
		     }
		  }
		  if (c ==2)
		  {
		     str = str + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 2 to 100 are :");
	       System.out.println(str);
	   }
}
