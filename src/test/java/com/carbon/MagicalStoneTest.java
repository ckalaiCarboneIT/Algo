package com.carbon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagicalStoneTest {

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Test recursif de MagicStone")
    public void recursifMerge(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, MagicalStone.recursifMagicStone(input));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Test itératif de MagicStone")
    public void testIterativeMagicStone(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, MagicalStone.iterativeMagicStone(input));
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(Collections.EMPTY_LIST, Collections.EMPTY_LIST),
                Arguments.of(null, Collections.EMPTY_LIST),
                Arguments.of(List.of(1, 1, 2, 2, 2), List.of(4)),
                Arguments.of(List.of(1), List.of(1)),
                Arguments.of(List.of(1, 2), List.of(1, 2)),
                Arguments.of(List.of(1, 1), List.of(2)),
                Arguments.of(List.of(1, 1, 1), List.of(1, 2)),
                Arguments.of(List.of(1, 1, 2), List.of(3)),
                Arguments.of(List.of(1, 1, 1, 1), List.of(3)),
                Arguments.of(List.of(1, 2, 3, 4, 5), List.of(1, 2, 3, 4, 5)),
                Arguments.of(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), List.of(3, 4)),
                Arguments.of(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5), List.of(1, 8))
        );
    }
}
