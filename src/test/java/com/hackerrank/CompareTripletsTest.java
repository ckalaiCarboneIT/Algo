package com.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CompareTripletsTest {

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10), Arrays.asList(1, 1)),
                        Arguments.of(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8), Arrays.asList(2, 1)),
                        Arguments.of(Arrays.asList(50, 50, 50), Arrays.asList(50, 50, 50), Arrays.asList(0, 0))
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testCompareTriplets(List<Integer> a, List<Integer> b, List<Integer> expected) {
        assertEquals(expected, CompareTriplets.compareTriplets(a, b));
    }


}