package com.github.smmayank.leetcode.problems;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BestTimeToBuyAndSellStockTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
            Arguments.of(new int[] {7, 1, 5, 3, 6, 4}, 5),
            Arguments.of(new int[] {7, 6, 4, 3, 1}, 0),
            Arguments.of(new int[] {1, 2, 1}, 1),
            Arguments.of(new int[] {1}, 0),
            Arguments.of(new int[] {1, 2}, 1),
            Arguments.of(new int[] {2, 1}, 0),
            Arguments.of(new int[] {1, 2, 3, 2, 3, 4, 3, 4, 5, 0}, 4),
            Arguments.of(new int[] {1, 2, 3, 4, 0, 1, 2, 3}, 3),
            Arguments.of(new int[] {1, 2, 3, 0, 1, 2, 3}, 3),
            Arguments.of(new int[] {10, 9, 8, 6, 7, 5, 4}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void testArguments(int[] market, int profit) {
        Assertions.assertEquals(
            profit,
            new BestTimeToBuyAndSellStock().maxProfit(market)
        );
    }

}