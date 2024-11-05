package com.codingame;

public class SumRangeCalculator {

    /**
     * Retourne la somme des entiers compris entre 10 et 100 inclusifs
     * contenus dans le tableau passé en paramètre.
     *
     * @param numbers le tableau d'entiers
     * @return la somme des entiers compris entre 10 et 100 inclusifs
     */
    public static int sumRange(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number >= 10 && number <= 100)
                sum += number;
        }
        return sum;
    }
}
