package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Problem(
        id = 169,
        name = "Majority Element",
        url = "https://leetcode.com/problems/majority-element"
)
public class MajorityElement {
    public int majorityElement(int[] numbers) {
        if (true) {
            return majorityElementOptimised(numbers);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.computeIfAbsent(number, integer -> 0);
            map.computeIfPresent(number, (key, value) -> value + 1);
        }
        return map.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);

    }

    public int majorityElementOptimised(int[] numbers) {
        int count = 0;
        int candidate = -1;
        for (int number : numbers) {
            if (count == 0) {
                candidate = number;
            }
            count = candidate == number
                    ? count + 1
                    : count - 1;
        }
        return candidate;
    }
}
