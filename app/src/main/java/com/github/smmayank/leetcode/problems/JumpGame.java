package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
        id = 55,
        name = "Jump Game",
        url = "https://leetcode.com/problems/jump-game"
)
public class JumpGame {
    public boolean canJump(int[] input) {
        return pathPossibleJump(input);
    }

    private boolean pathPossibleJump(int[] input) {
        int maxIndex = 0;
        for (int currentIndex = 0; currentIndex < input.length; currentIndex++) {
            if (maxIndex < currentIndex) {
                // no need to proceed we cannot go any further
                break;
            }
            maxIndex = Math.max(input[currentIndex] + currentIndex, maxIndex);
            if (maxIndex >= input.length - 1) {
                // we can jump straight away
                return true;
            }
        }
        return false;
    }

    private boolean pathPossibleJumpRecursive(int[] input, int currentIndex) {
        if (currentIndex + input[currentIndex] >= input.length - 1) {
            return true;
        }
        for (int hop = input[currentIndex]; hop > 0; hop--) {
            var isPossibleFromCurrent = pathPossibleJumpRecursive(
                    input,
                    Math.min(currentIndex + hop, input.length - 1)
            );
            if (isPossibleFromCurrent) {
                return true;
            }
        }
        return false;
    }
}
