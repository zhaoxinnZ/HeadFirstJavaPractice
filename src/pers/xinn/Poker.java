package pers.xinn;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        String[] S = {"S", "W", "D", "C"};
        String[] I = new String[13];
        String[][] combinedList = new String[S.length][I.length];
        for (int i = 0; i < 13; i++) {
            I[i] = String.format("%d",i);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int cardnumber = j+1;
                combinedList[i][j] = S[i] + cardnumber;
            }
        }
        System.out.println(Arrays.deepToString(combinedList));
    }
}