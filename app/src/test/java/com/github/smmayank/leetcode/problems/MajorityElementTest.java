package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MajorityElementTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                Arguments.of(new int[]{2}, 2),
                Arguments.of(new int[]{2, 2, 2, 2, 2, 2, 2}, 2),
                Arguments.of(new int[]{3, 4, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testSample(int[] numbers, int output) {
        Assertions.assertEquals(
                output,
                new MajorityElement().majorityElement(numbers)
        );
    }

}