/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HowManyDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i = 1;
		while (num / 10 != 0) {
		    i++;
		    num /= 10;
		}
		if (i > 3) System.out.println("More than 3 digits");
		else System.out.println(i);
	}
}
