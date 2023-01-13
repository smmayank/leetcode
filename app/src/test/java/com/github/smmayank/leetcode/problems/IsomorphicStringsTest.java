package com.github.smmayank.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {

    @Test
    void sample1() {
        Assertions.assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    void sample2() {
        Assertions.assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    void sample3() {
        Assertions.assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }

    @Test
    void sample4() {
        Assertions.assertFalse(new IsomorphicStrings().isIsomorphic("badc", "baba"));
    }
}