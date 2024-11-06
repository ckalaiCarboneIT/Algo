package com.codingame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwinTest {

    @ParameterizedTest(name = "{index} => s1={0}, s2={1}, expected={2}")
    @MethodSource("provideStringsForIsTwin")
    void testIsTwin1(String s1, String s2, boolean expected) {
        assertEquals(expected, Twin.isTwin1(s1, s2));
    }

    private static Stream<Arguments> provideStringsForIsTwin() {
        return Stream.of(Arguments.of("Marion", "Romain", true),
                Arguments.of("abc", "abc", true),
                Arguments.of("abc", "def", false),
                Arguments.of("abc", "abcd", false),
                Arguments.of("Marion", "romain", true),
                Arguments.of("", "", true),
                Arguments.of("abc", "", false),
                Arguments.of(null, "abc", false),
                Arguments.of("abc", null, false),
                Arguments.of(null, null, false));
    }
}
