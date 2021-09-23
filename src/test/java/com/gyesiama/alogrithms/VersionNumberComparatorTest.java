package com.gyesiama.alogrithms;

import com.gyesiama.algorithms.VersionNumberComparator;
import org.junit.Assert;
import org.junit.Test;

public class VersionNumberComparatorTest {
    VersionNumberComparator comparator = new VersionNumberComparator();

    @Test
    public void compareVersions() {

        Assert.assertTrue(comparator.compare("14", "14.0") == 0);
        Assert.assertTrue(comparator.compare("15", "14") > 0);
        Assert.assertTrue(comparator.compare("15.1", "14.13.10") > 0);
    }
}
