package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    /* https://www.hackerrank.com/challenges/compare-the-triplets/problem */


    /*
     * Complete the 'compareTriplets' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>(2);
        int pointA = 0;
        int pointB = 0;
        for (int i = 0; i <= 2; i++) {
            if (a.get(i) > b.get(i)) {
                pointA++;
            } else if (a.get(i)< b.get(i)) {
                pointB++;
            }
        }

        result.add(0 ,pointA);
        result.add(1, pointB);

        return result;
    }


}
