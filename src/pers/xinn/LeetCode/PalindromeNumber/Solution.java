package pers.xinn.LeetCode.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        String s2 = new StringBuilder(s1).reverse().toString();

        boolean ans = (s1.equals(s2)) ? true : false;
        return ans;
    }
}
