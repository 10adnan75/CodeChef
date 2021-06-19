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
		while(t-->0) {
		    int n = input.nextInt();
			int k = input.nextInt();
			int[] a = new int[n+1];
			for (int i=1; i<=n; i++) a[i] = input.nextInt();
			if (k == n) {
			    System.out.println(0);
			} else {
			    int ans = 0;
			    for (int i=1; i<=k; i++) {
			        HashMap<Integer, Integer> myMap = new HashMap<>();
			        myMap.put(a[i], 1);
			        for (int j=i+k; j<=n; j+=k) {
			            if (myMap.containsKey(a[j])) {
			                myMap.put(a[j], myMap.get(a[j])+1);
			            } else {
			                myMap.put(a[j], 1);
			            }
			        }
			        int max = 0, tot = 0;
			        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			            int x = entry.getKey();
			            max = Math.max(myMap.get(x), max);
			            tot += myMap.get(x);
			        }
			        ans += tot - max;
			    }
			    System.out.println(ans);
			}
		}
	}
}
