package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    private static final Map<Character, Character> PARENTHESES_MAP = new HashMap<>();

    static  {
        PARENTHESES_MAP.put('(', ')');
        PARENTHESES_MAP.put('[', ']');
        PARENTHESES_MAP.put('{', '}');
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (PARENTHESES_MAP.containsKey(c)) {
                stack.push(c);
            }
            // Si c'est une parenthèse fermante, on vérifie si elle correspond à la dernière ouvrante
            else if (PARENTHESES_MAP.containsValue(c)) {
                char lastOpened =  stack.pop();
                char lastOpenedCompl =  PARENTHESES_MAP.get(lastOpened);

                if (stack.isEmpty() ||  lastOpenedCompl != c) {
                    return false;
                }
                
            }
        }

        return stack.isEmpty();
    }
} // {[()]}
