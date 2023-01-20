package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

import java.util.Arrays;
import java.util.stream.Collectors;

@Problem(
    id = 555,
    name = "Reverse Words in a String III",
    url = "https://leetcode.com/problems/reverse-words-in-a-string-iii"
)
public class ReverseWordsInAStringIII {

    private String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        while (leftIndex < rightIndex) {
            var temp = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return new String(chars);
    }

    public String reverseWords(String input) {
        return Arrays.stream(input.split("\s+"))
            .map(this::reverseWord)
            .collect(Collectors.joining(" "));
    }
}
