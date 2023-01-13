package com.github.smmayank.leetcode.problems;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class BinarySearchTest {

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void sample1() {
        Assertions.assertEquals(
            4,
            new BinarySearch().search(new int[] {-1, 0, 3, 5, 9, 12}, 9)
        );
    }

    @Test
    void sample2() {
        Assertions.assertEquals(
            -1,
            new BinarySearch().search(new int[] {-1, 0, 3, 5, 9, 12}, 2)
        );
    }

    @Test
    void sample3() {
        Assertions.assertEquals(
            0,
            new BinarySearch().search(new int[] {2}, 2)
        );
    }

    @Test
    void sample4() {
        Assertions.assertEquals(
            -1,
            new BinarySearch().search(new int[] {2}, 3)
        );
    }

    @Test
    void sample5() {
        Assertions.assertEquals(
            1,
            new BinarySearch().search(new int[] {2, 3}, 3)
        );
    }

    @Test
    void sample6() {
        Assertions.assertEquals(
            -1,
            new BinarySearch().search(new int[] {}, 3)
        );
    }

    @Test
    void sample7() {
        Assertions.assertEquals(
            -1,
            new BinarySearch().search(new int[] {2, 3}, 4)
        );
    }

}