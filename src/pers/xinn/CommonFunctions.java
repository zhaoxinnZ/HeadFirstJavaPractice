package pers.xinn;

import java.util.ArrayList;

public class CommonFunctions {
    static ArrayList SearchIndex(int[] List, int index){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < List.length; i++) {
            if (List[i] == index){
                arrayList.add(i);
            }
        }
        return arrayList;

    }
}
