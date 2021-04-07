/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] possibleProfits = new long[n];
		for (int t=0; t<n; t++) possibleProfits[t] = input.nextInt();
		Arrays.sort(possibleProfits);
		for (int i=0; i<n; i++) {
		    possibleProfits[i] = (possibleProfits[i]*(n-i));
		}
		Arrays.sort(possibleProfits);
		System.out.println(possibleProfits[n-1]);
	}
}


