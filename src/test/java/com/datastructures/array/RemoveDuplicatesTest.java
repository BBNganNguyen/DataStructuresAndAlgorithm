package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        assertEquals(2, RemoveDuplicates.removeDuplicates1(new int[] {1,1,2}));
        assertEquals(5, RemoveDuplicates.removeDuplicates1(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}
