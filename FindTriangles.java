/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solve(int m, int n) {
        int max = 0, min = 0, mCount = 0, nCount = 0;
        if (m==1 && n==1) return 0;
        if (m > n) {
            max = m;
            min = n;
        } 
        else {
            max = n;
            min = m;
        }
        int i=0;
        while (max > 0) {
            mCount += (--max);
            i++;
        }
        mCount *= min;
        while (min > 0) {
            nCount += (--min);
        }
        nCount *= i; 
        return mCount + nCount;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
		    int mPoints = input.nextInt();
		    int nPoints = input.nextInt();
		    System.out.println(solve(mPoints, nPoints));
		}
	}
}
