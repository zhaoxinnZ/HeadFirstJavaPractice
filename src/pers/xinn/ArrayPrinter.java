package pers.xinn;

public class ArrayPrinter {
    public static void print(int[] a){
        int row = a.length;
        for (int i = 0; i < row; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void print(int[][] a){
        int row = a.length;
        int column = a[0].length;
        for (int i = 0; i < row; i++) {
            System.out.print(a[i][0] + " ");
        }
        System.out.println();
        for (int i = 0; i < column; i++) {
            System.out.print(a[0][i] + " ");
        }
    }
}
