package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class IntegerReversionTest {
    @Test
    public void testReverseInteger() {
        assertEquals("4321", IntegerReversion.reverseInteger(1234));
        assertEquals(0,0);
    }

    @Test
    public void testReverseInteger2() {
        assertEquals("4321", IntegerReversion.reverseInteger2(1234));
        assertEquals(0,0);
    }

}