package pers.xinn.LeetCode.RomanToInteger;

public class Solution {
    public int romanToInt(String s) {
        String[] arr = s.split("",-1);
        int sum = 0;
        int counter = 0;
        while (counter < arr.length - 1){
            int curval = IValue(arr[counter]);
            int nextval = IValue(arr[counter+1]);
            if (curval >= nextval) {
                sum = sum + IValue(arr[counter]);
                counter++;
            }else {
                sum = sum + IValue(arr[counter+1]) - IValue(arr[counter]);
                counter = counter + 2;
            }
        }
        return sum;
    }
    public int IValue(String s){
        switch (s){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;

        }
    }
}
