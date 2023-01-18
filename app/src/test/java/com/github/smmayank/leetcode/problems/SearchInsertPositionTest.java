package com.github.smmayank.leetcode.problems;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInsertPositionTest {

    private static Stream<Arguments> getArguments() {
        return Stream.of(
            Arguments.of(new int[] {1, 3, 5, 6}, 5, 2),
            Arguments.of(new int[] {1, 3, 5, 6}, 2, 1),
            Arguments.of(new int[] {1, 3, 5, 6}, 7, 4),
            Arguments.of(new int[] {1, 3, 5, 6}, 0, 0),
            Arguments.of(new int[] {}, 2, 0),
            Arguments.of(new int[] {1, 3, 5, 7, 9}, 4, 2)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "getArguments")
    void testSamples(int[] inputArray, int target, int expected) {
        int actual = new SearchInsertPosition().searchInsert(inputArray, target);
        Assertions.assertEquals(expected, actual);
    }
}