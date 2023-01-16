package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.Problem;

@Problem(
    id = 278,
    name = "First Bad Version",
    url = "https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i"
)
public class FirstBadVersion {

    private final VersionStatus versionStatus;

    public FirstBadVersion(VersionStatus versionStatus) {
        this.versionStatus = versionStatus;
    }

    private boolean isBadVersion(int versionNumber) {
        return versionStatus.isBadVersion(versionNumber);
    }

    public int firstBadVersion(int n) {
        int leftIndex = 1;
        int rightIndex = n;
        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (isBadVersion(midIndex)) {
                rightIndex = midIndex;
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return leftIndex;
    }

    public static class VersionStatus {

        private final int badVersionNumber;

        public VersionStatus(int badVersionNumber) {
            this.badVersionNumber = badVersionNumber;
        }

        boolean isBadVersion(int versionNumber) {
            return versionNumber >= badVersionNumber;
        }
    }

}
