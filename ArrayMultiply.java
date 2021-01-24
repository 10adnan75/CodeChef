import java.util.Scanner;

public class ArrayMultiply {

    public static int[][] makeArray(int row, int column) {
        Scanner S = new Scanner(System.in);
        int[][] array = new int[row][column];
        System.out.println("Enter Array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = S.nextInt();
            }
        }
        return array;
    }

    public static int[][] multiplyArray(int[][] a, int[][] b, int row, int column) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = 0;
                for (int k = 0; k < b.length; k++) {
                    array[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return array;
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no. of rows of 1st array: ");
        int r1 = S.nextInt();
        System.out.print("Enter no. of columns of 1st array: ");
        int c1 = S.nextInt();
        int[][] a = makeArray(r1, c1);
        displayArray(a);
        System.out.print("Enter no. of rows of 2nd array: ");
        int r2 = S.nextInt();
        System.out.print("Enter no. of columns of 2nd array: ");
        int c2 = S.nextInt();
        if (c1 != r2) {
            System.out.println("Given arrays can't be multiplied!");
        } else {
            int[][] b = makeArray(r2, c2);
            displayArray(b);
            int[][] result = multiplyArray(a, b, r1, c2);
            System.out.println("Resultant Array:");
            displayArray(result);
        }
    }
}
