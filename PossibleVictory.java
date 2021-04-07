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
		int targetNeeded = input.nextInt();
		int oversPlayed = input.nextInt();
		int currentScore = input.nextInt();
		int maxScore = currentScore + ((20 - oversPlayed) * 36);
		if (maxScore <= targetNeeded) System.out.println("NO");
		else System.out.println("YES");
	}
}
