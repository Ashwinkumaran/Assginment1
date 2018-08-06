import java.util.*;
public class Palindrome 
{
	public static void main(String args[])
	   {
		int num, r = 0, remainder, str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();

        str = num;
        while( num != 0 )
        {
            remainder = num % 10;
            r = r * 10 + remainder;
            num  /= 10;
        }

        if (str== r)
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");
    }

	   }
		


