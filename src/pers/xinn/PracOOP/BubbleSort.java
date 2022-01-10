package pers.xinn.PracOOP;

import java.util.List;

public class BubbleSort {
    private int[] SortedList;

    public BubbleSort(int[] L){
        int[] Sorted = L.clone();
        for (int i = 0; i < Sorted.length; i++) {
            for (int j = 0; j < Sorted.length-1; j++) {

                if (Sorted[j] > Sorted[j+1]){
                    int temp;
                    temp = Sorted[j];
                    Sorted[j] = Sorted[j+1];
                    Sorted[j+1] = temp;
                }
            }
        }
        this.SortedList = Sorted;
        }

        public int[] getList(){
            return SortedList;
        }
    }
