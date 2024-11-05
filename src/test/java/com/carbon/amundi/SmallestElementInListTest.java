package com.carbon.amundi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmallestElementInListTest {

    public static Stream<Arguments> provideTestCases() {

        return  Stream.of(
                Arguments.of(List.of(3, 1, 4, 1, 5, 9), 1),
                Arguments.of(List.of('c', 'a', 'b'), 'a')
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    <T extends Comparable<T>> void findSmallestElement(List<T> inputList, T expected) {
        Assertions.assertEquals(expected, SmallestElementInList.findSmallestElement(inputList));
    }
}