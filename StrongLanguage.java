/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String strongLanguage(String s, int n, int k) {
        int maxCount = 0, count = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '*') {
                count++;
                if (count > maxCount) maxCount = count;
            } else {
                count = 0;  
            }
        }
        if (maxCount >= k) return "YES";
        return "NO";
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
		    int stringLength = input.nextInt();
		    int peekValue = input.nextInt();
		    String myString = input.next();
		    System.out.println(strongLanguage(myString, stringLength, peekValue));
		}
	}
}
