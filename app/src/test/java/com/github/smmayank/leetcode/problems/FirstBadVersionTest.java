package com.github.smmayank.leetcode.problems;

import com.github.smmayank.leetcode.problems.FirstBadVersion.VersionStatus;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
class FirstBadVersionTest {

    @Test
    void sample1() {
        VersionStatus versionStatus = new VersionStatus(4);
        Assertions.assertEquals(
            4,
            new FirstBadVersion(versionStatus).firstBadVersion(5)
        );
    }

    @Test
    void sample2() {
        VersionStatus versionStatus = new VersionStatus(1);
        Assertions.assertEquals(
            1,
            new FirstBadVersion(versionStatus).firstBadVersion(1)
        );
    }

    @Test
    void sample3() {
        VersionStatus versionStatus = new VersionStatus(1);
        Assertions.assertEquals(
            1,
            new FirstBadVersion(versionStatus).firstBadVersion(Integer.MAX_VALUE)
        );
    }

    @Test
    void sample4() {
        VersionStatus versionStatus = new VersionStatus(1702766719);
        Assertions.assertEquals(
            1702766719,
            new FirstBadVersion(versionStatus).firstBadVersion(2126753390)
        );
    }

    @Test
    void sample5() {
        VersionStatus versionStatus = new VersionStatus(Integer.MAX_VALUE);
        Assertions.assertEquals(
            Integer.MAX_VALUE,
            new FirstBadVersion(versionStatus).firstBadVersion(Integer.MAX_VALUE)
        );
    }
}