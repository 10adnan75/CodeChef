/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SmallFactorial
{
    public static int factorialOfNum (int num) {
        if (num == 0) return 1;
        return num * factorialOfNum(num - 1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
		    int num = input.nextInt();
		    System.out.println(factorialOfNum(num));
		}
	}
}
