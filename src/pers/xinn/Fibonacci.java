package pers.xinn;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the fib sequence result you want to see");
        int sc = scanner.nextInt();
        for (int i = 0; i < sc; i++) {
            if (i == 0 || i == 1) {
                System.out.printf("%s ", i);
            } else {
                System.out.printf("%s ", fib(i));
            }
        }
    }
    public static long fib(int n){
        int[] sequence = new int[n];
        sequence[0] = 1;
        sequence[1] = 1;
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        return sequence[n-1];
    }
}
