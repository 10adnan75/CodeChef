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
		int t = input.nextInt();
		while (t-- > 0) {
		    double total = 1;
		    for (int i=0; i<4; i++) {
		        total *= input.nextDouble();
		    }
		    total = 100 / total;
		    if ((Math.round(total * 100.0) / 100.0) < 9.58) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
