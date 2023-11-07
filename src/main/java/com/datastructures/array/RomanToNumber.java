package com.datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    /**
     * Solution:
     * Create the map for ROMAN and number
     * Loop through the str and check two nearest character is special case or not.
     * If YES:
     * The result will be the subtraction like IV will be like 5(V)-1(I) = 4
     * If NO:
     * The result will be the number getting from the map
     * @param s ROMAN number in string
     * @return integer number
     */
    public static int romanToInt(String s) {
        int result = 0;
        if (s == null || s == "") {
            return 0;
        }
        int i = 0;
        while (i < s.length()) {
            if (isSpecialCase(s, i)) {
                result = result + ((map.get(s.charAt(i + 1))) - map.get(s.charAt(i)));
                i += 2;
            } else {
                result = result + (map.get(s.charAt(i)));
                i++;
            }
        }
        return result;
    }
    private static boolean isSpecialCase(String s, int i) {
        if ((i + 1) < s.length()) {
            return (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V')
                    || ((s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'))
                    || ((s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'))
                    || ((s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'))
                    || ((s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'))
                    || ((s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'));
        }
        return false;
    }
}
