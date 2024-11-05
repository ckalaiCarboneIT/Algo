package com.codingame;

public class StringUtils {

    static String concat(String[] strings) {
        StringBuilder sb  = new StringBuilder();
        for (String string : strings)
            sb.append(string);
        return sb.toString();
    }
}
