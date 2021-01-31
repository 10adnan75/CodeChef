/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Football
{
    public static void getResults (String[] goals, String[] fouls) {
        int i;
        int[] myArray = new int[fouls.length];
        for (i=0; i<goals.length; i++) {
            int score = (Integer.parseInt(goals[i]) * 20) - (Integer.parseInt(fouls[i]) * 10);
            if (score < 0) myArray[i] = 0;
            else myArray[i] = score;
        }
        Arrays.sort(myArray);
        System.out.println(myArray[myArray.length - 1]);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            input.nextLine();
            String[] goals = input.nextLine().split(" ");
            String[] fouls = input.nextLine().split(" ");
            getResults(goals, fouls);
        }
    }
}
