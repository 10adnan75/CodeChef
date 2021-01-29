/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecondLargest
{
    public static void secondLargest (int[] myArray) {
        Arrays.sort(myArray);
        System.out.println(myArray[1]);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] myArray = new int[3];
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
		    myArray[0] = input.nextInt();
		    myArray[1] = input.nextInt();
		    myArray[2] = input.nextInt();
		    secondLargest(myArray);
		}
	}
}
