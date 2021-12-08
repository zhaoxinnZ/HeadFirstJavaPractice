package pers.xinn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DiceFunctions {
    static int[] createRollerList(int length) {
        Random random = new Random();
        int[] RollerList = new int[length];
        for (int i = 0; i < length; i++) {
            int dicenumber = random.nextInt(6) + 1;
            RollerList[i] = dicenumber;
        }
        return RollerList;

    }static void RollerCounter(int[] List) {
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
    }static int[] RollerCounterList(int[] List) {
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
    }static ArrayList getMaxPosition(int[] List) {
        ArrayList arrayList = new ArrayList();
        int[] pointlist = new int[6];
        int max = Arrays.stream(List).max().getAsInt();
        arrayList = CommonFunctions.SearchIndex(List, max);
        return arrayList;
    }static ArrayList getMinPosition(int[] List) {
        ArrayList arrayList = new ArrayList();
        int[] pointlist = new int[6];
        int min = (int) Arrays.stream(pointlist).count();

        arrayList = CommonFunctions.SearchIndex(List, min);
        return arrayList;
    }static void getBiggestDices(ArrayList arrlist){
        ArrayList arrayList = new ArrayList();
        ArrayList result = new ArrayList();
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.indexOf(i)){
                max = arrayList.indexOf(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.indexOf(i) == max){
                result.add(i+1);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("The most frequently is "+(result.get(i)+" and the times are "+max));
        }
    }
}

