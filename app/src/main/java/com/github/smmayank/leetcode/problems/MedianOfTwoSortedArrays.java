package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
        id = 4,
        name = "Median of Two Sorted Arrays",
        url = "https://leetcode.com/problems/median-of-two-sorted-arrays"
)
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        // 4 / 2 = 2
        // 3 / 2 = 1
        int half = size / 2;
        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;
        int current = 0;
        int previous = current;
        while (firstIndex < nums1.length && secondIndex < nums2.length && mergedIndex <= (half)) {
            int firstNumber = nums1[firstIndex];
            int secondNumber = nums2[secondIndex];
            int number = 0;
            if (firstNumber < secondNumber) {
                firstIndex++;
                number = firstNumber;
            } else {
                secondIndex++;
                number = secondNumber;
            }
            mergedIndex++;
            previous = current;
            current = number;
        }
        if (mergedIndex <= (half + 1)) {
            while (firstIndex < nums1.length && mergedIndex <= (half)) {
                int number = nums1[firstIndex];
                firstIndex++;
                mergedIndex++;
                previous = current;
                current = number;
            }
            while (secondIndex < nums2.length && mergedIndex <= (half)) {
                int number = nums2[secondIndex];
                secondIndex++;
                mergedIndex++;
                previous = current;
                current = number;
            }
        }
        if (size % 2 == 0) {
            return (previous + current) / 2.0;
        } else {
            return current;
        }
    }

}
