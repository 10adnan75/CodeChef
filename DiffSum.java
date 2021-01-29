/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DiffSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int i = input.nextInt(), j = input.nextInt();
		System.out.println((i>j)? i-j : i+j);
	}
}
