package com.codingame;

public class Twin {

    public static boolean isTwin1(String a, String b) {

        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int i = 0;
        while (i < a.length()) {
            char c = a.charAt(i);
            if (!b.contains(String.valueOf(c))) {
                return false;
            }
            i++;
        }
        return true;
    }




}
