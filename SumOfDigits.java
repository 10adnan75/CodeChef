/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfDigits
{
    public static int sumOfDigits(int num) {
        if(num==0) return(num);
        return(num%10 + sumOfDigits(num/10));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n-- > 0) {
		    int num = input.nextInt();
		    System.out.println(sumOfDigits(num));
		}
	}
}
