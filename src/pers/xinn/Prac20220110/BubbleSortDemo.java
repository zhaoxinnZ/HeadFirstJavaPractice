package pers.xinn.Prac20220110;

public class BubbleSortDemo {
    public static void main(String[] args) {


        Integer array[] = {3,4,2,1};


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //BubbleSort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {

                if (array[j] > array[j+1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
