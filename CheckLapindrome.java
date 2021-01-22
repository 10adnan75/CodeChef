import java.util.Arrays;
import java.util.Scanner;

public class CheckLapindrome {

    public static void checkLap (String input) {
        int i, midIndex = input.length()/2;
        System.out.println(input.charAt(midIndex));
        char array1[] = new char[input.length()];
        char array2[] = new char[input.length()];
        for(i=0; i<midIndex; i++) {
            array1[i] = input.charAt(i);
        }
        if(input.length() % 2 == 0) {
            for(i = midIndex; i < input.length(); i++) {
                array2[i] = input.charAt(i);
            }
        }
        else {
            for (i = midIndex + 1; i < input.length(); i++) {
                array2[i] = input.charAt(i);
            }
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(array1);
        System.out.println(array2);
        int k = 0;
        for(i=0; i<array1.length; i++) {
            if(array1[i]!=array2[i]) k = -1;
        }
        if(k==-1) System.out.println("NO");
        else System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0;
        while(i < num) {
            String s = input.next();
            checkLap(s);
            i++;
        }
    }
}
