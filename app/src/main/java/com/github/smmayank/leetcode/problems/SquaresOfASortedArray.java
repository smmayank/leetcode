package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    id = 977,
    name = "Squares of a Sorted Array",
    url = "https://leetcode.com/problems/squares-of-a-sorted-array"
)
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] inputArray) {
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;
        int resultIndex = inputArray.length - 1;
        int[] resultArray = new int[inputArray.length];
        while (leftIndex <= rightIndex) {
            if (Math.abs(inputArray[leftIndex]) < Math.abs(inputArray[rightIndex])) {
                resultArray[resultIndex] = (int) Math.pow(inputArray[rightIndex], 2);
                rightIndex--;
            } else {
                resultArray[resultIndex] = (int) Math.pow(inputArray[leftIndex], 2);
                leftIndex++;
            }
            resultIndex--;
        }
        return resultArray;
    }
}
