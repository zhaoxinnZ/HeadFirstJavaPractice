package pers.xinn;

import java.util.List;

public class SortingAlgorithms {
    public static int[] BubbleSort(int[] List){
        int[] SortedList = List;
        for (int i = 0; i < List.length; i++) {
            for (int j = 0; j < List.length-1; j++) {
                if (SortedList[j] > SortedList[j+1]){
                    int temp = SortedList[j];
                    SortedList[j] = SortedList[j+1];
                    SortedList[j+1] = temp;
                }
            }

        }
        return SortedList;
    }
}
