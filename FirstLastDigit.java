import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FirstLastDigit
{
    public static void sumOfFirstLast(String num, int len) {
        int[] numDigits = new int[len];
        int myNum = Integer.parseInt(num);
        int i = 0;
        while (myNum != 0) {
            numDigits[i] = myNum % 10;
            myNum /= 10;
            i++;
        }
        System.out.println(numDigits[0] + numDigits[len - 1]);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
		    String num = input.next();
		    sumOfFirstLast(num, num.length());
		}
	}
}
