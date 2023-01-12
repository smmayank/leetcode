package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {

    @Test
    void sample1() {
        Assertions.assertArrayEquals(
            new int[] {1, 3, 6, 10},
            new RunningSumOf1dArray().runningSum(new int[] {1, 2, 3, 4})
        );
    }

    @Test
    void sample2() {
        Assertions.assertArrayEquals(
            new int[] {1, 2, 3, 4, 5},
            new RunningSumOf1dArray().runningSum(new int[] {1, 1, 1, 1, 1})
        );
    }

    @Test
    void sample3() {
        Assertions.assertArrayEquals(
            new int[] {3, 4, 6, 16, 17},
            new RunningSumOf1dArray().runningSum(new int[] {3, 1, 2, 10, 1})
        );
    }

    @Test
    void sample4() {
        Assertions.assertArrayEquals(
            new int[] {1},
            new RunningSumOf1dArray().runningSum(new int[] {1})
        );
    }

    @Test
    void sample5() {
        Assertions.assertArrayEquals(
            new int[] {1, 11},
            new RunningSumOf1dArray().runningSum(new int[] {1, 10})
        );
    }

}