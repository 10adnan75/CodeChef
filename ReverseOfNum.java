import java.util.*;
class ReverseOfNum {
	
	public static int reverse(int num, int sum) {
		if(num == 0) {
		    return sum;
		}
		return(reverse(num/10, sum*10 + num%10));
}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int rev = reverse(num, 0);
		System.out.println("Reverse: " + rev);
	}
}