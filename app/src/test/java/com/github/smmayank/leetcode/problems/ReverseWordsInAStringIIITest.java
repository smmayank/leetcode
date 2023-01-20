package com.github.smmayank.leetcode.problems;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseWordsInAStringIIITest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of("God Ding", "doG gniD"),
            Arguments.of("God", "doG"),
            Arguments.of("God ", "doG"),
            Arguments.of(" ", ""),
            Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testSample(String input, String output) {
        Assertions.assertEquals(
            output,
            new ReverseWordsInAStringIII().reverseWords(input)
        );
    }
}