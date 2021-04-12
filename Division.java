/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long solve(int a, int b, int k) {
        if (a % b == 0) return 0;
        int dec = a / b;
        long sum = 0;
        for(int i=0; i<k; i++) {
            a = a - (b * dec);
            if (a == 0) break;
            a *= 10;
            dec = a / b;
            sum += dec;
        }
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
		    int k = input.nextInt();
		    int a = input.nextInt();
		    int b = input.nextInt();
		    System.out.println(solve(a, b, k));
		}
	}
}
