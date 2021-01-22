import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] array = s.split(" ");
        int withdraw = Integer.parseInt(array[0]);
        double totalAmount = Double.parseDouble(array[1]);
        if(withdraw%5==0 && (totalAmount-withdraw-0.5>=0)) {
            totalAmount = totalAmount-withdraw-0.5;
        }
        System.out.printf("%.2f", totalAmount);
    }
}
