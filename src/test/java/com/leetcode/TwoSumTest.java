package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @ParameterizedTest
    @MethodSource("provideNumbersForTwoSum")
    void testTwoSum(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    private static Stream<Arguments> provideNumbersForTwoSum() {
        return Stream.of(
                Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1}),
                Arguments.of(new int[] {3,2,4}, 6, new int[] {1,2}),
                Arguments.of(new int[] {3,3}, 6, new int[] {0,1})
        );
    }
}