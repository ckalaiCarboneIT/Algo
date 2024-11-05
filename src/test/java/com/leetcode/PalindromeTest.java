package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeTest {

    private static Stream<Arguments> provideNumbersForIsPalindrome() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false),
                Arguments.of(12321, true),
                Arguments.of(123321, true),
                Arguments.of(1234321, true),
                Arguments.of(0, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForIsPalindrome")
    void testIsPalindrome(int number, boolean expected) {
        boolean result = Palindrome.isPalindrome(number);
        assertEquals(expected, result, () -> number + " should be " + (expected ? "" : "not ") + "a palindrome");
    }
}