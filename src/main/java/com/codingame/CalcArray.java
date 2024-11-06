package com.codingame;

import java.util.stream.IntStream;

public class CalcArray {

    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(IntStream.range(1,4).sum());

    }
}