package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    name = "Running Sum of 1d Array",
    id = 1480,
    url = "https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1"
)
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int previous = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] += previous;
            previous = nums[i];
        }
        return nums;
    }
}
