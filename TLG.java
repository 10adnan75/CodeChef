/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TLG
{
    public static void theLeadGame (int[] iScores, int[] jScores, int[] winnerPerRound, int[] lead) {
        int max = 0;
        int winner = 0;
        for (int i = 0; i < lead.length; i++) {
            if (max < lead[i]) {
                max = lead[i];
                winner = winnerPerRound[i];
            }
        }
        System.out.println(winner + " " + max);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] iScores = new int[n];
		int[] jScores = new int[n];
		int[] winnerPerRound = new int[n];
		int[] lead = new int[n];
		int k = 0;
		int cScoreP1 = 0, cScoreP2 = 0;
		while (n-- > 0) {
		    int i = input.nextInt();
		    int j = input.nextInt();
		    cScoreP1 += i;
		    cScoreP2 += j;
		    iScores[k] = cScoreP1;
		    jScores[k] = cScoreP2;
		    if (cScoreP1 > cScoreP2) {
		        lead[k] = cScoreP1 - cScoreP2;
		        winnerPerRound[k] = 1;
		    }
		    else {
		        lead[k] = cScoreP2 - cScoreP1;
		        winnerPerRound[k] = 2;
		    }
		    k++;
		}
		theLeadGame(iScores, jScores, winnerPerRound, lead);
	}
}
