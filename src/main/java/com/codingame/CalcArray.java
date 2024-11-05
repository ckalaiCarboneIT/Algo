package com.codingame;

public class CalcArray {

    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }
        return sum;
    }
}