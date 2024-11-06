package com.codingame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavanaisTest {

    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of( "havellavo, savecravet maveetaving tavonavight.", "hello, secret meeting tonight.")
        );

    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void translate(String expected, String actual) {
        assertEquals(expected, Javanais.translate2Javanais(actual));
    }
}