package pers.xinn;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public interface DiceFunctions {
    public static int[] createRollerList(int length) {
        Random random = new Random();
        int[] RollerList = new int[length];
        for (int i = 0; i < length; i++) {
            int dicenumber = random.nextInt(6) + 1;
            RollerList[i] = dicenumber;
        }
        return RollerList;
    }

    static void RollerCounter(int[] List) {
        int[] DiceList = new int[6];
        for (int i = 0; i < 6; i++) {
            int counter = 0;
            for (int j = 0; j < List.length; j++) {
                if (List[j] == (i + 1)) {
                    counter++;
                }
            }
            DiceList[i] = counter;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Point " + (i + 1) + " occurs " + DiceList[i] + " times ");
        }
    }

    static int[] RollerCounterList(int[] List) {
        int[] DiceList = new int[6];
        for (int i = 0; i < 6; i++) {
            int counter = 0;
            for (int j = 0; j < List.length; j++) {
                if (List[j] == (i + 1)) {
                    counter++;
                }
            }
            DiceList[i] = counter;
        }
        return DiceList;
    }

    static void getBiggestDices(int[] List) {
        int max = Arrays.stream(List).max().getAsInt();
        for (int i = 0; i < List.length; i++) {
            if (List[i] == max) {
                System.out.println("The Biggest times is " + max + " and the points are " + (i + 1));
            }
        }
    }

     static void getSmallestDices(int[] List) {
        int min = Arrays.stream(List).min().getAsInt();
        for (int i = 0; i < List.length; i++) {
            if (List[i] == min) {
                System.out.println("The Smallest times is " + min + " and the points are " + (i + 1));
            }
        }
    }
}



