package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringReversionTest {
    @Test
    public void testReverseAString() {
        assertTrue("".equals(StringReversion.reverseString("")));
        assertTrue("cba".equals(StringReversion.reverseString("abc")));
        assertFalse("123".equals(StringReversion.reverseString("123")));
    }


}
