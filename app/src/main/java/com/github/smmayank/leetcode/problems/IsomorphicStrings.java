package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Problem(
    id = 205,
    name = "Isomorphic Strings",
    url = "https://leetcode.com/problems/isomorphic-strings"
)
public class IsomorphicStrings {

    private int[] createStringMeta(String input) {
        int[] stringMeta = new int[input.length()];
        Map<Character, Integer> map = new HashMap<>();
        final AtomicInteger counter = new AtomicInteger();
        for (int index = 0; index < input.length(); index++) {
            char currentCharacter = input.charAt(index);
            stringMeta[index] = map.computeIfAbsent(
                currentCharacter,
                key -> counter.incrementAndGet()
            );
        }
        return stringMeta;
    }

    public boolean isIsomorphic(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            return false;
        }
        int[] firstMeta = createStringMeta(firstString);
        int[] secondMeta = createStringMeta(secondString);
        return Arrays.equals(firstMeta, secondMeta);
    }
}
