package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    id = 704,
    name = "Binary Search",
    url = "https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i"
)
public class BinarySearch {
    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }
        return -1;
    }
}
