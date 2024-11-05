package com.codingame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRangeCalculatorCalculatorTest {


    @Test
    void testEmptyArray() {
        int[] numbers = {};
        assertEquals(0, SumRangeCalculator.sumRange(numbers), "Un tableau vide devrait retourner 0");
    }

    @Test
    void testNumbersOutOfRange() {
        int[] numbers = {1, 2, 3};
        assertEquals(0, SumRangeCalculator.sumRange(numbers), "Les nombres hors de la plage devraient être ignorés");
    }

    @Test
    void testSomeNumbersInRange() {
        int[] numbers = {5, 10, 15, 20, 25};
        assertEquals(70, SumRangeCalculator.sumRange(numbers), "Seuls les nombres dans la plage devraient être additionnés");
    }

    @Test
    void testAllNumbersInRange() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        assertEquals(550, SumRangeCalculator.sumRange(numbers), "Tous les nombres dans la plage devraient être additionnés");
    }

    @Test
    void testMixedNumbers() {
        int[] numbers = {5, 10, 15, 110};
        assertEquals(25, SumRangeCalculator.sumRange(numbers), "Seuls les nombres dans la plage devraient être additionnés");
    }

    @Test
    void testNegativeAndHighNumbers() {
        int[] numbers = {-10, 0, 10, 50, 99, 101};
        assertEquals(159, SumRangeCalculator.sumRange(numbers), "Les nombres négatifs et ceux au-dessus de 100 devraient être ignorés");
    }

    @Test
    void testAllNumbersAboveRange() {
        int[] numbers = {200, 300, 400};
        assertEquals(0, SumRangeCalculator.sumRange(numbers), "Les nombres au-dessus de la plage devraient être ignorés");
    }
}