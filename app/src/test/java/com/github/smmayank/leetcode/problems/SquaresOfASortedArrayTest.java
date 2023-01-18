package com.github.smmayank.leetcode.problems;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SquaresOfASortedArrayTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[] {}, new int[] {}),
            Arguments.of(new int[] {-7, -3, 2, 3, 11}, new int[] {4, 9, 9, 49, 121}),
            Arguments.of(new int[] {-4, -1, 0, 3, 10}, new int[] {0, 1, 9, 16, 100})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testArguments(int[] inputArray, int[] outputArray) {
        Assertions.assertArrayEquals(
            outputArray,
            new SquaresOfASortedArray().sortedSquares(inputArray)
        );

    }
}