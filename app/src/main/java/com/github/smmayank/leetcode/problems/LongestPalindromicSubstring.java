package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

@Problem(
        id = 5,
        name = "Longest Palindromic Substring",
        url = "https://leetcode.com/problems/longest-palindromic-substring"
)
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Queue<String> solutions = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
        int[][] cache = new int[s.length()][s.length()];
        for (int start = 0; start < chars.length; start++) {
            for (int end = chars.length - 1; end >= start; end--) {
                // use cache here
                if (cache[start][end] == 1) {
                    continue;
                }
                if (isPalindrome(chars, start, end)) {
                    solutions.add(new String(chars, start, end - start + 1));
                }
                cache[start][end] = 1;
            }
        }
        return solutions.poll();
    }

    private boolean isPalindrome(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
