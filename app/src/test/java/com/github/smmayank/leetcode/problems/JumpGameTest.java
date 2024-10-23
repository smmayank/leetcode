package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class JumpGameTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, true),
                Arguments.of(new int[]{3, 2, 1, 0, 4}, false),
                Arguments.of(new int[]{1}, true),
                Arguments.of(new int[]{1, 0}, true),
                Arguments.of(new int[]{2}, true),
                Arguments.of(new int[]{2, 0}, true),
                Arguments.of(new int[]{0}, true),
                Arguments.of(new int[]{0, 1}, false),
                Arguments.of(new int[]{1, 0, 1}, false)

        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testSample(int[] input, boolean output) {
        Assertions.assertEquals(
                output,
                new JumpGame().canJump(input)
        );
    }

}