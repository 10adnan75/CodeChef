/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TurboSort
{
    public static void turboSort (int[] myArray) {
        for(int i=0; i<myArray.length; i++) {
	        while(myArray[i]-- > 0) {
	            System.out.println(i);
	        }
	}
	return;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] myArray = new int[n+1];
		while(n-- > 0) {
		    int num = input.nextInt();
		    myArray[num] += 1;
		}
		turboSort(myArray);
	}
}
