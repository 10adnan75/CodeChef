/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyFour
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
		    String num = input.next();
		    int count = 0;
		    for (int i=0; i<num.length(); i++) {
		        if (num.charAt(i) == '4') {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
