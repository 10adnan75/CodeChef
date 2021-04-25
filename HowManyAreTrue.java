/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int countTrue (boolean[] a) {
        int c=0;
        for (int i=0; i<a.length; i++) {
            if (a[i]) c++;
        }
        return c;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		boolean[] a = {true, false, true, true, false, false};
		System.out.println(countTrue(a));
	}
}
