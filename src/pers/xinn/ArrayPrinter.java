package pers.xinn;

public class ArrayPrinter {
    public static void printString(int[] dim1Array){
        for (int value : dim1Array){
            System.out.printf("%s ",value);
        }
        System.out.println();
    }

    public static void printString(int[][] dim2Array){
        for (int[] row : dim2Array){
            for (int value : row){
                System.out.printf("%s ", value);
            }
            System.out.println();
        }
    }
}
