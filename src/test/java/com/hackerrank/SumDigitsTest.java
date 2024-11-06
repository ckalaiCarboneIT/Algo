package com.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @ParameterizedTest()
    @MethodSource("provideTestCases")
    void testSumDigits1(int num, int expected) {
        assertEquals(expected, SumDigits.sumDigits1(num));
    }

    @ParameterizedTest()
    @MethodSource("provideTestCases")
    void testSumDigits2(int num, int expected) {
        assertEquals(expected, SumDigits.sumDigits2(num));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(Arguments.of(1234, 10),
                Arguments.of(3443, 14), Arguments.of(0, 0),
                Arguments.of(1, 1), Arguments.of(10, 1),
                Arguments.of(123456789, 45),
                Arguments.of(-1234, 10),
                Arguments.of(1001, 2));
    }
}