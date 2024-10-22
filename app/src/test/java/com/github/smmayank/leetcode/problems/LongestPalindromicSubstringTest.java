package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestPalindromicSubstringTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testSample(String input, String output) {
        Assertions.assertEquals(
                output,
                new LongestPalindromicSubstring().longestPalindrome(input)
        );
    }

}