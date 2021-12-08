package pers.xinn;

public class SortingAlgorithms {
    static int[] BubbleSort(int[] List){
        int[] SortedList = List;
        for (int i = 0; i < List.length-1; i++) {
            for (int j = SortedList.length-1; j >= 1; j--) {
                if (SortedList[j-1] > SortedList[j]){
                    int temp = SortedList[j-1];
                    SortedList[j-1] = SortedList[j];
                    SortedList[j] = temp;
                }
            }
        }
        return SortedList;
    }
}
