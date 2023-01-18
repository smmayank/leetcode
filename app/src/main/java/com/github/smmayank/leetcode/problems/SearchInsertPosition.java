package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    id = 35,
    name = "Search Insert Position",
    url = "https://leetcode.com/problems/search-insert-position"
)
public class SearchInsertPosition {

    public int searchInsert(int[] inputArray, int target) {
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (target < inputArray[midIndex]) {
                rightIndex = midIndex - 1;
            } else if (target > inputArray[midIndex]) {
                leftIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return leftIndex;
    }
}
