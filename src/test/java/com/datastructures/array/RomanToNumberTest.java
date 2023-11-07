package com.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToNumberTest {

    @Test
    public void romanToIntTest() {
        assertEquals(3, RomanToNumber.romanToInt("III"));
        assertEquals(58, RomanToNumber.romanToInt("LVIII"));
        assertEquals(1994, RomanToNumber.romanToInt("MCMXCIV"));
    }
}
