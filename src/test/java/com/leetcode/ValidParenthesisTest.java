package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesisTest {

    @ParameterizedTest
    @MethodSource("provideParenthesesStrings")
    public void testIsValid(String input, boolean expected) {
        assertAll(
                () -> assertEquals(expected, ValidParenthesis.isValid(input))
        );
    }

   private static Stream<Arguments> provideParenthesesStrings() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("", true),
                Arguments.of("(", false),
                Arguments.of(")", false),
                Arguments.of("((()))", true),
                Arguments.of("({[()]}", false),
                Arguments.of("({[)]}", false)
        );
    }

}