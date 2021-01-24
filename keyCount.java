import java.util.HashMap;
import java.util.Scanner;

public class keyCount {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int a[] = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7};
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        System.out.print("Enter key: ");
        int key = S.nextInt();
        System.out.print(map.get(key));
    }
}
