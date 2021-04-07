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
        while(t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int[] s = new int[n];
            int[] r = new int[n];
            for (int i=0; i<n; i++) {
                s[i] = input.nextInt();
                r[i] = input.nextInt();
            }
            int maxRating = 0;
            for (int k=0; k<n; k++) {
                if (s[k] <= x) {
                    if (maxRating < r[k]) maxRating = r[k];
                }
            }
            System.out.println(maxRating);
        }
	}
}
