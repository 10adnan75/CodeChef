/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean isPresent (String s, char c) {
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) return true;
        }
        return false;
    }
    
    public static void solve(String s) {
        String ans = new String();
        for(int i=0; i<s.length(); i++) {
            if(!isPresent(ans, s.charAt(i))) ans += s.charAt(i);
        }
        System.out.println(ans);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
		    String s = input.next();
		    solve(s);
		}
	}
}
