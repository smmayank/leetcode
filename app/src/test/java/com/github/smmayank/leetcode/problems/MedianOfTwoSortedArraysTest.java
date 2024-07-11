package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MedianOfTwoSortedArraysTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[] { 1, 3 }, new int[] { 2 }, 2),
                Arguments.of(new int[] { 1, 2 }, new int[] { 3, 4 }, 2.5)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testSample(int[] first, int[] second, double output) {
        Assertions.assertEquals(
                output,
                new MedianOfTwoSortedArrays().findMedianSortedArrays(first, second)
        );
    }

}
