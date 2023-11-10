package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static com.datastructures.array.LongestCommonPrefix.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    public void testlongestCommonPrefix() {
        assertEquals("fl", longestCommonPrefix(new String[] { "flower", "flow", "flight"}));
        assertEquals("", longestCommonPrefix(new String[] { "dog", "racecar"}));
    }
}
