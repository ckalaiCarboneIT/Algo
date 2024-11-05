package com.leetcode;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0)  return false;
        String str = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.contentEquals(reversed);
    }
}
