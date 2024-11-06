package com.codingame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codingame.ClosestToZero.closestToZero;
import static org.junit.jupiter.api.Assertions.*;

class ClosestToZeroTest {

    @ParameterizedTest(name = "{index} => ts={0}, expected={1}")
    @MethodSource("provideTestCases")
    void testClosestToZero(double[] ts, int expected) {
        assertEquals(expected, closestToZero(ts));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(Arguments.of(new double[]{}, 0),
                Arguments.of(new double[]{5}, 5),
                Arguments.of(new double[]{-5}, -5),
                Arguments.of(new double[]{-10, -5, -1, 1, 5, 10}, 1),
                Arguments.of(new double[]{5, -5}, 5),
                Arguments.of(new double[]{5, 6, 7, 2}, 2),
                Arguments.of(new double[]{-5, -6, -7, -2}, -2),
                Arguments.of(new double[]{0, -1, 1, -2, 2}, 0),
                Arguments.of(new double[]{-273, 5526, -1}, -1),
                Arguments.of(new double[]{1, 1, 1, -1}, 1));
    }
}