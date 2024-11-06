package com.codingame;

import java.util.Arrays;
import java.util.Optional;

public class ClosestToZero {

    /* Todo : In this exercise, you have to analyze records of temperature to find the closest to zero.
         Sample temperatures. Here, -1.7 is the closest to 0.
         Implement the function closestToZero to return the temperature closer to zero which belongs to the array ts.
         If ts is empty, return 0 (zero).
         If two numbers are as close to zero, consider the positive number as the closest to zero
         (eg. if ts contains -5 and 5, return 5).
         Input: Temperatures are always expressed with floating-point numbers ranging from -273 to 5526.
        ts is always a valid array and is never null.
      */

    public static double closestToZero(double[] ts) {

        if (ts.length == 0) return 0.0;

        Optional<Double> positiveNumClosest = Arrays.stream(ts).boxed().filter(el -> el >= 0).sorted().findFirst();
        Optional<Double> negativeNumClosest = Arrays.stream(ts).boxed().filter(el -> el < 0).max(Double::compareTo);

        if (positiveNumClosest.isEmpty() && negativeNumClosest.isPresent()) {
            return negativeNumClosest.get();
        } else if (positiveNumClosest.isPresent() && negativeNumClosest.isEmpty()) {
            return positiveNumClosest.get();
        }

        if (Math.abs(positiveNumClosest.get()) < Math.abs(negativeNumClosest.get())) return positiveNumClosest.get();
        if (Math.abs(negativeNumClosest.get()) < Math.abs(positiveNumClosest.get())) return negativeNumClosest.get();
        if (Math.abs(negativeNumClosest.get()) == Math.abs(positiveNumClosest.get())) return positiveNumClosest.get();

        return 0;
    }
}
