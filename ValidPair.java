/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String getAnswer (int[] a) {
        for (int i=0; i<3; i++) {
            if(i==2) return "NO";
            if(a[i] == a[i+1]) return "YES";
        }
        return "NO";
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int[] colors = new int[3];
		for(int i=0; i<3; i++) colors[i] = input.nextInt();
		Arrays.sort(colors);
		System.out.println(getAnswer(colors));
	}
}
