package com.codingame;

import java.util.HashSet;
import java.util.Set;

public class Javanais {

    public static final Set<Character> VOYELLES;

    static {
        VOYELLES = new HashSet<>(5);
        VOYELLES.add('a');
        VOYELLES.add('e');
        VOYELLES.add('i');
        VOYELLES.add('o');
        VOYELLES.add('u');
    }

    static String translate2Javanais(String str) {
        StringBuilder sb = new StringBuilder();
        boolean lastWasVowel = false;
        for (char c : str.toCharArray()) {
            if (VOYELLES.contains(c)) {
                if (!lastWasVowel) {
                    sb.append("av");
                }
                lastWasVowel = true;
            } else {
                lastWasVowel = false;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}