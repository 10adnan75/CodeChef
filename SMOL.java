/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SMOL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
		    int t = input.nextInt();
		    int k = input.nextInt();
		    if (k!=0) System.out.println(t%k);
		    else System.out.println(t);
		}
	}
}
